/*
Filename: AdapterDesignPattern
Created: Siddhesh Salvi
Change history:19.2.2020 / Siddhesh Salvi
Created: Siddhesh Salvi
Adapter design pattern is one of the structural design pattern and its used so that
two unrelated interfaces can work together. The object that joins these unrelated
interface is called an Adapter. Use Adapter design pattern to solve mobile charger
which adapts to a Mobile battery needs 3 volts to charge but the normal socket
produces either 120V (US) or 240V (India). So the mobile charger works as an adapter
between mobile charging socket and the wall socket.
*/
trait SocketAdapter {
  def get120Volt(): Volt

  def get12Volt(): Volt

  def get3Volt(): Volt
}

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

class Socket {
  def getVolt(): Volt = {
    new Volt(120)
  }
}

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

object AdapterDesignPattern {
  def main(args: Array[String]): Unit = {
    var flag = true
    while (flag) {
      try {
        var soc = new SocketClassAdapterImpl()
        println(soc.get3Volt().getVolts())
        println(soc.get12Volt().getVolts())
        println(soc.get120Volt().getVolts())
        flag = false
      }
      catch {
        case NullPointerException => println("Nullpointer exception occurred ")
        case _ => print("Something went wrong Error occurred.")

      }
    }
  }
}

