package SingletonImplementation

class Product private(var state : Int){
  def doSomething() = {
    state += 1
    println("No of objects : "+this.state)
  }
}
object Product {
  private var _instance: Product = null
  def instance() ={
    if(_instance == null){
      _instance = new Product(0)
    }
    _instance
  }
}