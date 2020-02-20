package AdapterDesignPattern

class Volt {
  private var volt: Int = 0

  def this(value: Int) {
    this()
    this.volt = value
  }

  def getVolts(): Int = {
    return volt
  }

  def setVolts(value: Int) {
    this.volt = value
  }
}
