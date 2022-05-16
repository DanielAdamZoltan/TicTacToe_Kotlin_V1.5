import kotlinx.serialization.Serializable

@Serializable
data class Games(val id: Int, val winner: String, val dateCreated: String) {

    companion object {
        const val path = "/game"
    }
}