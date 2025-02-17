//class 04

fun table(){
    while (true){
        println("Enter a Number: ")
        val number = readln().toInt()

        for(i in 1..10){
            println("$number * $i = ${number*i}")
        }
    }
}