object MapToList {
  def main(args: Array[String]): Unit = {
    // Creating a map with some key-value pairs
    val myMap: Map[String, Int] = Map("Alice" -> 25, "Bob" -> 30, "Charlie" -> 35, "David" -> 28, "Eva" -> 32)

    // Converting the map to a list of key-value pairs
    val myList: List[(String, Int)] = myMap.toList

    // Printing the original map
    println("Original Map: " + myMap)

    // Printing the list of key-value pairs
    println("List of Key-Value Pairs: " + myList)
  }
}
