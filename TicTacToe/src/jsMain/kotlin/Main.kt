//import kotlinx.browser.document
//import react.dom.render
//import react.create
//

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.html.respondHtml
import io.ktor.http.content.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.serialization.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.javatime.CurrentDateTime
import org.jetbrains.exposed.sql.javatime.datetime
import org.jetbrains.exposed.sql.transactions.transaction
import java.sql.DriverManager
import java.util.*
import java.sql.*
import kotlinx.html.*


internal var conn: Connection? = null
internal var username = "madam666"
internal var password = "A@DC3tXme$/P3x_"


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




    val container = document.getElementById("root") ?: error("Nem található a konténer!")

    render(App.create(), container)
//    document.getElementById("root")?.innerHTML = "Hello, Kotlin/JS!"
}
