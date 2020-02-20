package AdapterDesignPattern


trait SocketAdapter {
  def get120Volt(): Volt

  def get12Volt(): Volt

  def get3Volt(): Volt
}
