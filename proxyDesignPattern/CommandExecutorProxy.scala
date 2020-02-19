package proxyDesignPattern
//Proxy class
class CommandExecutorProxy extends CommandExecutor {
  private var isAdmin: Boolean = false
  private var executor: CommandExecutor = _

  def this(user: String, pwd: String){
    this()
    if ("admin1".equals(user) && "admin@123".equals(pwd)) isAdmin = true;
    executor = new CommandExecutorImpl()
  }

  override def runCommand(cmd: String): Unit = {
    if (isAdmin) executor.runCommand(cmd)
    else if (cmd.trim.startsWith("rm")) throw new Exception("rm command is not allowed for non-admin users.")
    else executor.runCommand(cmd)
  }
}



