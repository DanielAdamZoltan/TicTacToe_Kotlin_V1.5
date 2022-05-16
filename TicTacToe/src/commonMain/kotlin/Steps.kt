import kotlinx.serialization.Serializable

@Serializable
data class Steps(val id: Int, val step: String) {

    companion object {
        const val path = "/step"
    }
}