/*
Filename: AdapterDesignPattern
Created: Siddhesh Salvi
Change history:19.2.2020 / Siddhesh Salvi
Created: Siddhesh Salvi
3. Proxy design pattern as the name suggests creates a Proxy Object to a real Object so
as to provide controlled access to a functionality. Create a Command Executor
  Program that will execute certain system commands based on the user type is admin
or otherwise. The Proxy design pattern link shows the same example.
*/

package proxyDesignPattern
import proxyDesignPattern.CommandExecutor
import proxyDesignPattern.CommandExecutorProxy


//Test class
object ProxyPatternTest extends App {

  var executor:CommandExecutor = new CommandExecutorProxy("admin1","admn@123")
  try {
    executor.runCommand("ls")
    executor.runCommand(" rm -rf abc.pdf")
  }catch {
    case _=>println("rm command is not allowed")
  }
}

