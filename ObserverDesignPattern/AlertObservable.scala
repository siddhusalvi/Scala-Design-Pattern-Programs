package ObserverDesignPattern

trait AlertObservable {

  //Function to register
  def register(observer: AlertObserver): Unit;

  //Function to unregister
  def unregister(observer: AlertObserver): Unit;

  //Function to notify observers
  def notifyObservers(alert: Alert): Unit;
}
