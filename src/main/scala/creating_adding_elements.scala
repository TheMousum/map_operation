object MapExample {
  def main(args: Array[String]): Unit = {
    // Creating a map with initial elements
    var myMap: Map[String, Int] = Map("Alice" -> 25, "Bob" -> 30, "Charlie" -> 35)

    // Printing the initial map
    println("Initial Map: " + myMap)

    // Adding new elements to the map
    myMap += ("David" -> 28, "Eva" -> 32)

    // Printing the map after adding new elements
    println("Map after adding new elements: " + myMap)
  }
}
