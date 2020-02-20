package AdapterDesignPattern

class SocketClassAdapterImpl extends SocketAdapter {
  var socket = new Socket()
  var v = socket.getVolt()

  override def get120Volt(): Volt = socket.getVolt()

  override def get12Volt(): Volt = {
    convertVolt(v, 10)
  }

  private def convertVolt(v: Volt, value: Int): Volt = {
    new Volt(v.getVolts() / value)
  }

  override def get3Volt(): Volt = {
    convertVolt(v, 40)
  }
}