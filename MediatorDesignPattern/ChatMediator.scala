package MediatorDesignPattern

//Mediator
trait ChatMediator {
  def SendMessage(msg: String, user: User): Unit

  def addUser(user: User): Unit
}
