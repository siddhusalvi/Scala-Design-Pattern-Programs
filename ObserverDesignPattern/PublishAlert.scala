package ObserverDesignPattern

import scala.collection.mutable.ArrayBuffer

class PublishAlert private extends AlertObservable {

  val observerList: ArrayBuffer[AlertObserver] = ArrayBuffer[AlertObserver]();

  override def register(observer: AlertObserver): Unit = {
    observerList += observer
  }

  override def unregister(observer: AlertObserver): Unit = {
    val index: Int = observerList.indexOf(observer)
    observerList.remove(index)
  }

  override def notifyObservers(alert: Alert): Unit = {
    observerList.foreach {
      observer => observer.publish(alert)
    }
  }
}

//companion object
object PublishAlert {
  val publish_alert: PublishAlert = new PublishAlert

  def getInstance(): PublishAlert = {
    publish_alert
  }
}
