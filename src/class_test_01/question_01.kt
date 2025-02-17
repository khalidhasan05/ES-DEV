package class_test_01

fun qn01(){
    print("What is your total amount: ")
    val purchaseAmount = readln().toInt()

    when {
        purchaseAmount in 100..500 -> println("Your payable amount is ${(purchaseAmount*0.95).toInt()}")
        purchaseAmount in 501..1000 -> println("Your payable amount is ${(purchaseAmount*0.90).toInt()}")
        purchaseAmount > 1000  -> println("Your payable amount is ${(purchaseAmount*0.85).toInt()}")
        else -> println("your payable amount is $purchaseAmount")
    }
}