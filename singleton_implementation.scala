/*
Filename: singleton_implementation
Created: Siddhesh Salvi
Change history:19.2.2020 / Siddhesh Salvi
Created: Siddhesh Salvi
1. Refer Singleton Link and practice the various Singleton Approaches that are
possible.
*/
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
object singleton_implementation extends App {
  Product.instance().doSomething()
  Product.instance().doSomething()
  Product.instance().doSomething()
}
