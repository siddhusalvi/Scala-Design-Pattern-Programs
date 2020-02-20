package FactoryMethodDesignPattern

case class PC (ram:String, hdd:String, cpu:String)extends Computer {
  override def getRAM: String = ram

  override def getCPU: String = cpu

  override def getHDD: String = hdd
}