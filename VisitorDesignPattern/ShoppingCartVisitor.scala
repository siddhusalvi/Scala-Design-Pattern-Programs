package VisitorDesignPattern

trait ShoppingCartVisitor {
  def visit(book:Book):Int;
  def visit(fruit:Fruit):Int;
}
