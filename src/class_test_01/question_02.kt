package class_test_01

fun qn02(){
    print("Enter the light color: ")
    val color = readln()
    when(color){
        "Red" -> println("Stop")
        "Yellow" -> println("Prepare to Stop")
        "Green" -> println("Go")
        else -> println("Invalid signal")
    }
}