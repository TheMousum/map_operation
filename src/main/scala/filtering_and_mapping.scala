object MapMappingAndFiltering {
  def main(args: Array[String]): Unit = {
    // Creating a map with some key-value pairs
    val myMap: Map[String, Int] = Map("Alice" -> 25, "Bob" -> 30, "Charlie" -> 35, "David" -> 28, "Eva" -> 32)

    // Mapping: Multiply each age by 2 using map
    val mappedMap: Map[String, Int] = myMap.mapValues(age => age * 2)
    println("Mapped Map (ages multiplied by 2): " + mappedMap)

    // Filtering: Filter out people with age greater than 30 using filter
    val filteredMap: Map[String, Int] = myMap.filter { case (_, age) => age <= 30 }
    println("Filtered Map (people with age <= 30): " + filteredMap)
  }
}
