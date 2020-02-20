import java.io.FileNotFoundException

import scala.FacadeDesignPattern
object displayAddressBook extends App {
  try {
    var addressbook = new FacadeDesignPattern() //calling Facade design pattern
    addressbook.viewContacts()
  }catch {
    case ex1:FileNotFoundException=>println("File not found exception occurred")
    case ex2:ClassNotFoundException=>println("Class not found exception occurred")
    case _=>println("Unknown exception occurred.")
  }
}
