/*
Filename: AdapterDesignPattern
Created: Siddhesh Salvi
Change history:20.2.2020 / Siddhesh Salvi
Created: Siddhesh Salvi
3. Prototype design pattern is used when the Object creation is a costly affair and
requires a lot of time and resources and you have a similar object already existing.
Use Prototype Pattern as shown in the Link above to create multiple Employee Object
*/

package ObserverDesignPattern

object test extends App {
  val alertObserver: AlertSubscribers = new AlertSubscribers(PublishAlert.getInstance())
  PublishAlert.getInstance().notifyObservers(new Alert("Big data"))

  PublishAlert.getInstance().notifyObservers(new Alert("machine learning"))

  PublishAlert.getInstance().notifyObservers(new Alert("AI"))

}
