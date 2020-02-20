package FactoryMethodDesignPattern

//Interface Computer
trait Computer {
  def getRAM: String

  def getHDD: String

  def getCPU: String

  override def toString = " Ram : " + getRAM + " Hdd : " + getHDD + " Cpu : " + getCPU
}

