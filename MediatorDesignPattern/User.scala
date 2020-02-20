package MediatorDesignPattern

//abstract class user
abstract class User {
  protected var mediator: ChatMediator = _
  protected var name: String = _

  def this(med: ChatMediator, name: String) {
    this()
    this.mediator = med
    this.name = name
  }
  def send(msg: String): Unit;

  def receive(msg: String): Unit;

}
