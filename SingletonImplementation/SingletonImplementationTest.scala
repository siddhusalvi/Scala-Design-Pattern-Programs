package SingletonImplementation

import java.io.FileNotFoundException

object SingletonImplementationTest extends App {
  try {
    Product.instance().doSomething()
    Product.instance().doSomething()
    Product.instance().doSomething()
  } catch {
    case ex1: FileNotFoundException => println("File not found exception occurred")
    case ex2: ClassNotFoundException => println("Class not found exception occurred")
    case _ => println("Unknown exception occurred.")
  }
}
