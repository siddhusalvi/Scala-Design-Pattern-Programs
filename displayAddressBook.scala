import scala.FacadeDesignPattern
object displayAddressBook extends App {
  var addressbook = new FacadeDesignPattern()//calling Facade design pattern
  addressbook.viewContacts()
}
