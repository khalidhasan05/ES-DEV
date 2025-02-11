fun isAnswerCorrect(userAnswer: String, correctAnswer: String): Boolean {
    return userAnswer.equals(correctAnswer, ignoreCase = true)
}
