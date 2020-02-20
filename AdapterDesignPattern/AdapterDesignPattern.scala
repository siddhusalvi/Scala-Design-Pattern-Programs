package AdapterDesignPattern
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
        case ex1: NullPointerException => println("Null pointer exception occurred ")
        case ex2: ClassNotFoundException => println("Class not found exception occurred ")
        case _ => print("Something went wrong Error occurred.")
      }
    }
  }
}