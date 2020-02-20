package ObserverDesignPattern

class AlertSubscribers(observable: AlertObservable) extends AlertObserver {
  observable.register(this)

  //Function to print published topic
  override def publish(alert: Alert): Unit = {
    println("topic is " + alert.topic)
  }
}
