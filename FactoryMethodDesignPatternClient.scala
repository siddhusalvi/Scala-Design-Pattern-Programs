
//Interface Computer
trait Computer {
  def getRAM:String
  def getHDD:String
  def getCPU:String

  override def toString = " Ram : "+getRAM+" Hdd : "+getHDD+" Cpu : "+getCPU
}


object CaseComputerFactory {
  def apply(compType:String, ram:String, hdd:String, cpu:String): Computer = {
    compType.toUpperCase match {
      case "PC" => PC(ram,hdd,cpu)
      case "SERVER" => Server(ram,hdd,cpu)
    }
  }
}

//class PC
case class PC(ram:String, hdd:String, cpu:String) extends Computer {
  override def getRAM: String = ram

  override def getCPU: String = cpu

  override def getHDD: String = hdd
}

//class Server
case class Server(ram:String, hdd:String, cpu:String) extends Computer {
  override def getRAM: String = ram

  override def getCPU: String = cpu

  override def getHDD: String = hdd
}

object FactoryMethodDesignPatternClient {

  def main(args: Array[String]): Unit = {
    var pc = CaseComputerFactory("pc","2 GB","500 GB","2.4 GHz");
    var  server = CaseComputerFactory("server","16 GB","1 TB","2.9 GHz");
    println("Factory PC Config:: "+pc);
    println("Factory Server Config:: "+server);
  }
  }
