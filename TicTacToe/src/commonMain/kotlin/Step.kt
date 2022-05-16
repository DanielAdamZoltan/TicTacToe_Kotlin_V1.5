import kotlinx.serialization.Serializable

@Serializable
data class Step(val step: String, val dateCreated: String) {
    val id: Int = step.hashCode()

    companion object {
        const val path = "/shoppingList"
    }
}