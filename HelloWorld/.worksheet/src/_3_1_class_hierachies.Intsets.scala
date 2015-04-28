package _3_1_class_hierachies


object Intsets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("kkk");$skip(41); 
	val t1 = new NonEmpty(3, Empty, Empty );System.out.println("""t1  : _3_1_class_hierachies.NonEmpty = """ + $show(t1 ));$skip(25); 
	
	
	val t2 = t1.incl(4);System.out.println("""t2  : _3_1_class_hierachies.IntSet = """ + $show(t2 ));$skip(21); 
	val t3 = t2.incl(2);System.out.println("""t3  : _3_1_class_hierachies.IntSet = """ + $show(t3 ))}
	
	
}



abstract  class IntSet {
	def incl(x: Int): IntSet
	def contains(x: Int): Boolean
	
	
}

/*

 Da von Empty eingentlich nur eine Instanz notwendig ist, kann man aus diese Klasse ein Singleton machen
 Singletons haben in Scala den Identifier "object"

class Empty   extends IntSet {
	 def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
	 
	 def contains(x: Int): Boolean = false
	 
	 override def toString = "."
}
*/

	object Empty   extends IntSet {
	 def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
	 
	 def contains(x: Int): Boolean = false
	 
	 override def toString = "."
}

class NonEmpty(elem: Int, leftElem: IntSet, rightElem: IntSet) extends IntSet {
	def contains(x: Int): Boolean =
		if ( x < elem )
			 leftElem.contains(x)
		else if ( x > elem)
			 rightElem.contains(x)
		else
			true

	
	def incl (x: Int): IntSet =
		if( x < elem )
			new NonEmpty( elem, leftElem incl x, rightElem )
		else if ( x > elem )
			new NonEmpty( elem, leftElem, rightElem incl x )
		else
			this
			
	
	override def toString = "{"+leftElem + elem + rightElem+"}"
}
