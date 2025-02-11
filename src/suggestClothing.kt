fun suggestClothing(temperature: Int): String {
    return when {
        temperature < 50 -> "Wear a jacket and warm clothes."
        temperature in 50..80 -> "Wear something comfortable."
        else -> "Wear light clothing." }
}
