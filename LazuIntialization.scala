/*
Filename: lazy_initialization 
Created: Siddhesh Salvi
Change history:19.2.2020 / Siddhesh Salvi
Created: Siddhesh Salvi
1. Refer Singleton Link and practice the various Singleton Approaches that are
possible. 
Lazy lazy_initialization
*/
object lazy_initialization{
  def main(args: Array[String]): Unit = {
    var flag = true
    while(flag){
      try {
        lazy val x = {
          println("computing x ")
          42
        }
        println("x computation : ")
        println(x)
        println("x is computed when required.")
        flag = false
      }
      catch{
        case _=>print("Something went wrong Error occurred.")
      }
    }
  }
}
