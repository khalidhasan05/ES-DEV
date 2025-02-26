fun collection(){
    val student = mutableListOf<String>()
    student.addAll(listOf("Khalid","Shupty"))

    student.add("Ishu")

    println(student)
    student.add(1,"Tom")
    println(student)

    val couple = mutableMapOf<String,String>()
    couple["Khalid"] = "Shupty"
    couple["Tom"] = "Ishu"

    println(couple)

    if (couple.containsKey("Tom")){
        println("He is Tom. She is ${couple["Tom"]}")
    }
}