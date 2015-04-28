package _3_1_class_hierachies.exercise

class IntSetNode(value: Int, leftNode: IntSet, rightNode: IntSet) extends IntSet {
    
  override def contains(x: Int): Boolean = 
      if( x < value) leftNode.contains(x)
      else if( x > value) rightNode contains x
      else true
      
   override def incl(x: Int): IntSet =
       if ( x < value) new IntSetNode( value, leftNode incl x , rightNode )
       else if ( x > value) new IntSetNode( value, leftNode, rightNode.incl(x))
       else this
       
      
    override def union(other: IntSet): IntSet = 
      ((leftNode union rightNode) union other) incl value
}