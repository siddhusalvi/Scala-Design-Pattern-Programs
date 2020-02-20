package MediatorDesignPattern

import scala.collection.mutable.ArrayBuffer

//Mediator implementation
class ChatMediatorImpl extends ChatMediator {
  private var users: ArrayBuffer[User] = new ArrayBuffer[User]()


  override def SendMessage(msg: String, user: User): Unit = {
    for (usr <- this.users) {
      if (usr != user) {
        usr.receive(msg)
      }
    }
  }

  override def addUser(user: User): Unit = {
    users += user
  }
}
