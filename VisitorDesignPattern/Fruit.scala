package VisitorDesignPattern
//class fruit
class Fruit extends ItemElement {
  private var price:Int = 0
  private var weight:Int = 0
  private var name:String=""

  def this(value:Int,weight:Int,name:String){
    this()
    this.price = value
    this.weight = weight
    this.name = name
  }

  def getPricePerKg: Int = price


  def getWeight: Int = weight

  def getName: String = this.name

  override def accept(visitor: ShoppingCartVisitor): Int ={
    return visitor.visit(this)
  }
}
