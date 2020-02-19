package scala
import addressBook.AddressBook

class FacadeDesignPattern extends App {
  def viewContacts(): Unit ={
    println("i am so cool")
    var addressBook = new AddressBook()
    addressBook.loadData()
  }
}

