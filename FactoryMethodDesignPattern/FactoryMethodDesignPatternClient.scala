package FactoryMethodDesignPattern

object FactoryMethodDesignPatternClient {
  def main(args: Array[String]): Unit = {
    try {
      var pc = CaseComputerFactory("pc", "2 GB", "500 GB", "2.4 GHz");
      var server = CaseComputerFactory("server", "16 GB", "1 TB", "2.9 GHz");
      println("Factory PC Config:: " + pc);
      println("Factory Server Config:: " + server);
    }catch {
      case ex1:ClassNotFoundException=>println("Class not found exception occurred")
      case _=>println("Unknown exception occurred. ")
    }
  }
}
