fun main(){

    val name = "Khalid Hasan"
    val age = 23
    val height=5.5
    printDetails(name, age, height)
}

fun printDetails(name: String, age: Int, height: Double){
    println(name)
    println("Age: $age")
    println("Height: $height")
}