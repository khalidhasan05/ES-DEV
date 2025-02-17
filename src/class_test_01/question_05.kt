package class_test_01

fun qn05(){
    print("Enter your mark: ")
    val marks = readln().toInt()

    when (marks) {
        in 60..69 -> println("Grade D")
        in 70..79 -> println("Grade C")
        in 80..89 -> println("Grade B")
        in 90..100 -> println("Grade A")
        in 0..59 -> println("Grade F(Fail)")
        else -> println("Invalid")
    }
}