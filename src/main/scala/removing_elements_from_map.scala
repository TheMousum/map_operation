object MapExample {
  def main(args: Array[String]): Unit = {
    // Creating a map with initial elements
    var myMap: Map[String, Int] = Map("Alice" -> 25, "Bob" -> 30, "Charlie" -> 35, "David" -> 28, "Eva" -> 32)

    // Printing the initial map
    println("Initial Map: " + myMap)

    // Removing elements from the map
    myMap -= "Alice"  // Remove element with key "Alice"
    myMap -= "Eva"    // Remove element with key "Eva"

    // Printing the map after removing elements
    println("Map after removing elements: " + myMap)
  }
}
