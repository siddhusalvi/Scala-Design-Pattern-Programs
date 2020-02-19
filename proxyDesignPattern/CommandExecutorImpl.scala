package proxyDesignPattern
//Implementation
class CommandExecutorImpl extends CommandExecutor {
  override def runCommand(cmd: String): Unit = {
    Runtime.getRuntime().exec(cmd)
    println(" "+ cmd +"  command executed")
  }
}
