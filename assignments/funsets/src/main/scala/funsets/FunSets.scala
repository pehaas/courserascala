package funsets

import common._

/**
 * 2. Purely Functional Sets.
 */
object FunSets {
  /**
   * We represent a set by its characteristic function, i.e.
   * its `contains` predicate.
   */
  type Set = Int => Boolean // Hier wird ein sogenannter "type alias" defianiert. 
  // In diesem Fall ist der Typ Set eine Function die ein 
  // Int entgegen nimmt und Boolean returned 

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean =  s(elem) 
  /* Bsp:  val mySet = singletonSet(5)
   *       assertTrue( contains( mySet, 5 ) )
   *       assertFalse( contains( mySet, 7 ) )
   * 
   * der Aufruf "singletonSet(5)" erzeugt ein Set bzw. die dahinter liegende Function "x => x == elem"
   * "elem wird durch den uebergebene Wert ersetzt wodurch " x => x == 5 " ensteht 
   * 
   * contains nimmt nun dieses Set und somit die dahinter liegende Function als Parameter "s" 
   * entgegen und ruft sie ( die Function hinter Set)  mit dem uebergebenen Vergleichsparameter "elem" auf.
   * "elem" wird dem Functionsparameter "x" zugewiesen wurdurch folgends passiert
   * aus " x => x == 5 " wird " 5 == 5 "
   * aus " x => x == 5 " wird " 7 == 5 " 
   */

  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = { x => x == elem }
  /*
   * singeltonSet erstellt die Function die hinter dem Function-Alias "Set" liegt
   * und assigned den uebergebenen Wert "elem" an den Functions Parameter "elem"
   * ein Kurzform fuer die Funktion waere { _ == elem }
   * Bsp: aus singletonSet(5) entsteht ein Set das die Function "x => x == 5" enthält
   */

  
  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  def union(s: Set, t: Set): Set = { x => contains(s, x) || contains(t, x)      }

  /**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` and `t`.
   */
  def intersect(s: Set, t: Set): Set = { x => contains(s , x) && contains(t, x)}

  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */
  def diff(s: Set, t: Set): Set =  { x => contains(s , x) ^ contains(t, x) }
  /**
   * Returns the subset of `s` for which `p` holds.
   */
  def filter(s: Set, p: Int => Boolean): Set = {intersect(s, p)}

  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 3

  /**
   * Returns whether all bounded integers within `s` satisfy `p`.
   */
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      val d = ! p(a) && contains(s, a) 
      if ( ! p(a) && contains(s, a) ) false
      else if (a == bound) true
      else iter(a + 1)
    }
    iter(-bound)
  }

  /**
   * Returns whether there exists a bounded integer within `s`
   * that satisfies `p`.
   */
  def exists(s: Set, p: Int => Boolean): Boolean = !forall(s, x => !p(x)) 

  /**
   * Returns a set transformed by applying `f` to each element of `s`.
   */
  def map(s: Set, f: Int => Int): Set = {y => exists(s, x => y == f(x))}

  /**
   * Displays the contents of a set
   */
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  }

  /**
   * Prints the contents of a set on the console.
   */
  def printSet(s: Set) {
    println(toString(s))
  }
}
