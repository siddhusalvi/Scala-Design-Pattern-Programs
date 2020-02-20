package VisitorDesignPattern
//class Book
class Book extends ItemElement {

  private var price: Int = 0
  private var isbnNumber: String = ""

  def this(cost: Int, name: String) {
    this()
    this.price = cost
    this.isbnNumber = name
  }

  def getPrice: Int = price

  def getIsbnNumber: String = isbnNumber


  override def accept(visitor: ShoppingCartVisitor): Int = {
    return visitor.visit(this)
  }
}
