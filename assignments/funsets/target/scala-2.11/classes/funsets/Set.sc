package funsets

import FunSets._

object Set {

  def singletonSet(elem: Int): Set = x => x == elem
                                                  //> singletonSet: (elem: Int)funsets.FunSets.Set

}