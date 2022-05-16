import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.browser.window

val endpoint = window.location.origin

val jsonClient = HttpClient {
    install(JsonFeature) { serializer = KotlinxSerializer()}
}

suspend fun getGame(): List<Games> {
    return jsonClient.get(endpoint + Games.path)
}

suspend fun addGame(game: Games) {
    jsonClient.post<Unit>(endpoint + Games.path) {
        contentType(ContentType.Application.Json)
        body = game
    }
}

suspend fun getStep(): List<Steps> {
    return jsonClient.get(endpoint + Steps.path)
}

suspend fun addStep(step: Steps) {
    jsonClient.post<Unit>(endpoint + Steps.path) {
        contentType(ContentType.Application.Json)
        body = step
    }
}


