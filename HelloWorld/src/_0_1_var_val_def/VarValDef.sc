package _0_1_var_val_def

object VarValDef {

  /**
   * Methoden
   * Scala allows the omission of parentheses on methods of arity-0 (no arguments):
   * Arity-0
   */

  def reply() = 1                                 //> reply: ()Int
  // is the same as
  def reply1 = 1                                  //> reply1: => Int

  //reply kann mit und ohne klammern aufgerufen werden
  reply                                           //> res0: Int = 1
  reply()                                         //> res1: Int = 1

  //reply1 kann nur ohne klammern aufgerufen werden
  reply1                                          //> res2: Int = 1
  //reply1()  --> functioniert nicht

  /**
   * As of version 2.8, Scala now has support for named parameters. Named parameters in a method
   * invocation should be treated as regular parameters (spaced accordingly following the comma)
   * with a space on either side of the equals sign:
   */
  def reply3(x: Int, y: Int) = { println("" + x + y) }
                                                  //> reply3: (x: Int, y: Int)Unit
  reply3(1, 2)                                    //> 12
  reply3(y = 1, x = 2)                            //> 21

}