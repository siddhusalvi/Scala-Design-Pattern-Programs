/*
Filename: singleton_thread_safe
Created: Siddhesh Salvi
Change history:19.2.2020 / Siddhesh Salvi
Created: Siddhesh Salvi
1. Refer SIngleton Link and practice the various SIngleton Approaches that are
possible. 
Thread safe singleton
*/
object test {
  def print() = {
    println("Inside object.")
  }
}
object singleton_thread_safe {
  def main(args: Array[String]): Unit = {
    var flag = true
    while (flag) {
      try {
        test.print()
        var x = new test() //Shows error
        flag = false
      }
      catch {
        case _ => print("Something went wrong Error occurred.")
      }
    }
  }
} 