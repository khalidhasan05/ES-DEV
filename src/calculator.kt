fun calculator(var1: Double, var2: Double, op: Char):Double{
    return when(op){
        '+' -> (var1 + var2)
        '-' -> (var1 - var2)
        '*' -> (var1 * var2)
        '/' -> (var1 / var2)
        else -> {
            throw IllegalArgumentException("This is operation is not available in this calculator")
        }
    }
}