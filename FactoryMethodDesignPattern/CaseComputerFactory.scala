package FactoryMethodDesignPattern

object CaseComputerFactory {
  def apply(compType:String, ram:String, hdd:String, cpu:String): Computer = {
    compType.toUpperCase match {
      case "PC" => PC(ram,hdd,cpu)
      case "SERVER" => Server(ram,hdd,cpu)
    }
  }
}
