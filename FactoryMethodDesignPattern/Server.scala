package FactoryMethodDesignPattern
//class Server
case class Server(ram:String, hdd:String, cpu:String) extends Computer {
  override def getRAM: String = ram

  override def getCPU: String = cpu

  override def getHDD: String = hdd
}