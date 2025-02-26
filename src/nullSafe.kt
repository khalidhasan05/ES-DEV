fun nullSafe(){
    print("Enter your age: ")
    val age:Int? = null

    print(age?: 20)
    //elvis operator

    val listWithNulls: List<String?> = listOf("Kotlin","ktor", "sql", null)


    for (item in listWithNulls) {
        //if the item is not-null than prints the values and skip the null values
        item?.let { println(it) }

    }

}