package VisitorDesignPattern

trait ItemElement {
  def accept(visitor:ShoppingCartVisitor):Int;
 }
