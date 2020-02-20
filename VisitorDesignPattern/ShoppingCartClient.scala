package VisitorDesignPattern

class ShoppingCartClient extends App {
  var itemElement: Array[ItemElement] = Array(new Book(20, "1234"),
    new Book(100, "5678"),
    new Fruit(10, 2, "Banana"),
    new Fruit(5, 5, "Apple"))

  var total = calculatePrice(itemElement)
  println("Total cost : "+total)


  def calculatePrice(items: Array[ItemElement]): Int = {
    var visitor: ShoppingCartVisitor = new ShoppingCartVisitorImpl()
    var sum = 0
    for (item <- items) {
      sum += item.accept(visitor)
    }
    sum
  }
}
