package _0_1_var_val_def

object VarValDef {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(190); 

  /**
   * Methoden
   * Scala allows the omission of parentheses on methods of arity-0 (no arguments):
   * Arity-0
   */

  def reply() = 1;System.out.println("""reply: ()Int""");$skip(37); 
  // is the same as
  def reply1 = 1;System.out.println("""reply1: => Int""");$skip(65); val res$0 = 

  //reply kann mit und ohne klammern aufgerufen werden
  reply;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  reply();System.out.println("""res1: Int = """ + $show(res$1));$skip(63); val res$2 = 

  //reply1 kann nur ohne klammern aufgerufen werden
  reply1;System.out.println("""res2: Int = """ + $show(res$2));$skip(353); 
  //reply1()  --> functioniert nicht

  /**
   * As of version 2.8, Scala now has support for named parameters. Named parameters in a method
   * invocation should be treated as regular parameters (spaced accordingly following the comma)
   * with a space on either side of the equals sign:
   */
  def reply3(x: Int, y: Int) = { println("" + x + y) };System.out.println("""reply3: (x: Int, y: Int)Unit""");$skip(15); 
  reply3(1, 2);$skip(23); 
  reply3(y = 1, x = 2)}

}
