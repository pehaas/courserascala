package _3_3_polymorphism

trait List[T] {

    def isEmpty: Boolean
    
    def head: T
    
    def tail: List[T]
  
}



// die methoden head and tail sind direkt im constructor
class Cons[T](val head: T, val tail: List[T] ) extends List[T]{
    
  def isEmpty: Boolean = false
}


class Nil[T] extends List[T]{
  
  def isEmpty : Boolean = true
 
  def head = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Nil.tail")
  
//  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])
  
  // head und tail kann man alternativ auch mit dem returntyp "Nothing" declarieren
  // Nothing ist ein Subtype von jedem in Scala vorhanden Datentyp also auch von T
  // def head: Nothing = throw new NoSuchElementException("Nil.head")
  // def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}