package ObserverDesignPattern
//Function to publish alert
trait AlertObserver {
def publish(alert:Alert):Unit;
}
