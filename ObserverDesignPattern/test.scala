package ObserverDesignPattern

object test extends App {
  val alertObserver: AlertSubscribers = new AlertSubscribers(PublishAlert.getInstance())
  PublishAlert.getInstance().notifyObservers(new Alert("Big data"))

  PublishAlert.getInstance().notifyObservers(new Alert("machine learning"))

  PublishAlert.getInstance().notifyObservers(new Alert("AI"))

}
