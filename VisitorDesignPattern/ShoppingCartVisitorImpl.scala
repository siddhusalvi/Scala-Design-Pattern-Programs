package VisitorDesignPattern

class ShoppingCartVisitorImpl extends ShoppingCartVisitor {
  override def visit(book: Book): Int = {
    var cost = 0
    if(book.getPrice >50){
      cost = book.getPrice - 5
    }else{
      cost = book.getPrice
    }
    println("book :"+book.getIsbnNumber+" price : "+book.getPrice)
    return cost
  }

  override def visit(fruit: Fruit): Int = {
    var cost = fruit.getPricePerKg * fruit.getWeight
    println("fruit : "+fruit.getName+" weight : "+fruit.getWeight+" price : "+cost)
    return cost
  }
}
