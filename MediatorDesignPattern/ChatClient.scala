package MediatorDesignPattern

//Testing the pattern
object ChatClient extends App {

  var mediator: ChatMediator = new ChatMediatorImpl()

  var user1: User = new UserImpl(mediator, "sunny")
  var user2: User = new UserImpl(mediator, "vaibhav")
  var user3: User = new UserImpl(mediator, "siddhu")
  var user4: User = new UserImpl(mediator, "rinku")

  mediator.addUser(user1)
  mediator.addUser(user2)
  mediator.addUser(user3)
  mediator.addUser(user4)

  user1.send("hi everyone ")
}
