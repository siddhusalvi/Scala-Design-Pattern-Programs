package AdapterDesignPattern

class Socket {
  def getVolt(): Volt = {
    new Volt(120)
  }
}