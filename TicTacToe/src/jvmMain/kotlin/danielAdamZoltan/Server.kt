package danielAdamZoltan

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.html.respondHtml
import io.ktor.http.*
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.http.content.resources
import io.ktor.http.content.static
import io.ktor.network.sockets.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.serialization.*
import kotlinx.html.*
import kotlinx.html.dom.document
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.javatime.CurrentDateTime
import org.jetbrains.exposed.sql.javatime.datetime
import org.jetbrains.exposed.sql.transactions.transaction

internal var conn: Connection? = null
internal var username = "madam666"
internal var password = "A@DC3tXme$/P3x_"

fun HTML.index() {
    head {
        title("TicTacToe")
    }
    body {


        div {
            id = "root"
        }
        script(src = "/static/TicTacToe.js") {}
    }
}


object Steps : Table() {
    val id = integer("id")
    val step = varchar("step", 1)
    val dateCreated = datetime("date_created").defaultExpression(CurrentDateTime())
    val gameId = (integer("game_id") references Games.id).nullable()

    override val primaryKey = PrimaryKey(id, name = "PK_Steps_ID")
}

object Games : Table(){
    val id = integer("id").autoIncrement()
    val winner = varchar("winner", 50)

    override val primaryKey = PrimaryKey(id, name = "PK_Games_ID")
}





fun main() {

    Database.connect("jdbc:mysql://localhost:3306/tic_tac_toe", user = username, password = password)

    transaction {
        addLogger(StdOutSqlLogger)

        SchemaUtils.create(Games, Steps)
    }

    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
        install(ContentNegotiation) {
            json()
        }
        install(CORS) {
            method(HttpMethod.Get)
            method(HttpMethod.Post)
            anyHost()
        }
        install(Compression) {
            gzip()
        }
        routing {
            get("/") {
                call.respondHtml(HttpStatusCode.OK, HTML::index)
//                call.respondText( this::class.java.classLoader.getResource("index.html")!!.readText(), ContentType.Text.Html)
            }
            static("/static") {
                resources()
            }
        }
    }.start(wait = true)
    println("A játék elindult!")
}