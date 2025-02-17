package class_test_01


fun qn04() {
    print("Enter the number: ")
    val num = readln().toInt()
    var isprime = false

    if (num <= 1) {
        println("$num is not a prime Number")
        return
    }
    if(num == 2 || num == 3) {
        println("$num is a Prime number")
        return
    }
    for(i in 2..num/2){
        if(num%i == 0) {
            println("$num is not a prime number.")
            return
        } else {
         isprime = true
        }
    }

    if(isprime){
        println("$num is a Prime number")
    } else  {
        println("$num is not a prime number")
    }

}