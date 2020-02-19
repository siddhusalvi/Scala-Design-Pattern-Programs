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

