fun queue() {
 val fruits = MyQueue<String>()
 fruits.enqueue("Lichi")
 fruits.enqueue("Orange")
 val fruitList = listOf("Banana", "Apple", "Mango")
 fruits.enqueueList(fruitList)
 fruits.dequeue()
 fruits.displayQueue()
}

class MyQueue<T> {
 private val data = mutableListOf<T>()

 fun enqueue(item: T) {
  println("$item added to queue.")
  data.add(item)
 }

 fun enqueueList(list: List<T>) {
  list.forEach { enqueue(it) }
 }

 fun dequeue(): T? {
  return if (data.isNotEmpty()) {
   data.removeFirst()
  } else {
   null
  }
 }

 fun displayQueue() {
  if (data.isNotEmpty()) {
   data.forEachIndexed { index, item ->
    println("${index + 1}. $item")
   }
  } else {
   println("There is no data.")
  }
 }
}

