/*
Filename: prototypeDesignPattern
Created: Siddhesh Salvi
Change history:19.2.2020 / Siddhesh Salvi
Created: Siddhesh Salvi
3. Prototype design pattern is used when the Object creation is a costly affair and
requires a lot of time and resources and you have a similar object already existing.
Use Prototype Pattern as shown in the Link above to create multiple Employee Object
*/


case class Employees(data: List[String])

object prototypeDesignPattern {
  def main(args: Array[String]): Unit = {
    var flag = true
    while (flag) {
      try {
        var employees_obj = Employees(List("sunny", "vaibhav", "siddhu", "rinku"))
        var copy1 = employees_obj.copy()
        var copy2 = employees_obj.copy()
        var copy3 = employees_obj.copy()
        System.out.println(s"The prototype is: ")
        System.out.println(s"Copy is 1: $copy1")
        System.out.println(s"Copy is 2 : $copy2")
        System.out.println(s"Copy is 3 : $copy3")
        System.out.println(s"1 and 2 are equal: ${copy1 == copy2}")
        flag = false
      }
      catch {
        case ex1: ClassNotFoundException => println("Class not found exception occurred")
        case _ => println("Unknown exception occurred.")
      }
    }
  }
}



