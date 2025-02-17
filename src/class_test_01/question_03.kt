package class_test_01

fun qn03(){
    print("Enter the number: ")
    val num = readln().toInt()
    var sum = 0

    for (i in 2..num step 2 ){
        sum += i
    }
    println("Total sum is $sum")
}