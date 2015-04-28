package _3_1_class_hierachies.exercise

object EmptySet extends IntSet {
  
  override def contains(x: Int) = {false}
  override def incl(x: Int) = new IntSetNode(x, EmptySet, EmptySet)
  override def union(other: IntSet) = other
}

