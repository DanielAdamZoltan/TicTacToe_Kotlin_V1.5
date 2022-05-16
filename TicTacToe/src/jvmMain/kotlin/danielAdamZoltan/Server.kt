package danielAdamZoltan

import io.ktor.application.call
import io.ktor.html.respondHtml
import io.ktor.http.*
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.http.content.resources
import io.ktor.http.content.static
import kotlinx.html.*
import kotlinx.html.dom.document


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



fun main() {

    Database.connect("jdbc:mysql://localhost:3306/tic_tac_toe", user = username, password = password)

    transaction {
        addLogger(StdOutSqlLogger)

        SchemaUtils.create(Games, Steps)
    }
    embeddedServer(Netty, 8090, host = "127.0.0.1") {
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


        val conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tic_tac_toe", username, password)

        val query = conn.prepareStatement("Select * from games")

        val result = query.executeQuery()

        val games = mutableListOf<Game>()

        routing {
            get("/") {
                call.respondHtml(HttpStatusCode.OK, HTML::index)
//                call.respondText(
//                    this::class.java.classLoader.getResource("index.html")!!.readText(),
//                    ContentType.Text.Html
                )
            }
            static("/static") {
                resources()
            }
            route(Game.path) {

                get {
//                    call.respond(collection.find().toList())
//                    while (result.next()) {
//                        val id = result.getInt("id")
//
//                        val winner = result.getString("winner")
//
//                        games.add(Game(id, winner))
//                    }
                    println("mukodik")
                }
                post {
//                    collection.insertOne(call.receive<Game>())
                    call.respond(HttpStatusCode.OK)
                }
            }

        }
    }.start(wait = true)
    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
        routing {
            get("/") {
                call.respondHtml(HttpStatusCode.OK, HTML::index)
            }
            static("/static") {
                resources()
            }
        }
    }.start(wait = true)
    println("A játék elindult!")
}