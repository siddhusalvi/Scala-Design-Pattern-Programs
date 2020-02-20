package MediatorDesignPattern

class UserImpl(med: ChatMediator, name: String) extends User(med, name) {

  override def send(msg: String): Unit = {
    println(this.name + " :sending message : " + msg)
    mediator.SendMessage(msg, this)
  }

  override def receive(msg: String): Unit = {
    println(this.name + " :received message : " + msg)
  }
}
