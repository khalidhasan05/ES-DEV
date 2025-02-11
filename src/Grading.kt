fun gradingSystem(marks: Int): String{
    return when {
        marks >= 90 -> "A"
        marks >= 80 -> "B"
        marks >= 70 -> "C"
        marks >= 60 -> "D"
        else -> "F"
    }
}