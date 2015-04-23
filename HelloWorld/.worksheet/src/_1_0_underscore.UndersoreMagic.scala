package _1_0_underscore

// imports all the classes in the package matching
import scala.util.matching._
// imports all the members of the object Fun. (static import in java)
// import com.test.Fun._

// imports all the members of the object Fun but renames Foo to Bar
// import com.test.Fun.{ Foo => Bar , _ }

// imports all the members except Foo. To exclude a member rename it to _
// import com.test.Fun.{ Foo => _ , _ }

object UndersoreMagic {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(487); 

	def person = ("Peter", 35, 92);System.out.println("""person: => (String, Int, Int)""");$skip(27); 
	val (name,age,_) = person;System.out.println("""name  : String = """ + $show(name ));System.out.println("""age  : Int = """ + $show(age ));$skip(71); 
	println("Name of the person is "+name+" and he is "+age+" years old");$skip(138); 

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "anything other than one and two"
  };System.out.println("""matchTest: (x: Int)String""");$skip(254); 

  def matchTestClass(x: Any) = {
    x match {
      case List(1, _, _) => " a list with three element and the first element is 1"
      case List(_*)      => " a list with zero or more elements "
      case _             => "anything other"
    }
  };System.out.println("""matchTestClass: (x: Any)String""");$skip(34); val res$0 = 

  matchTestClass(List(1, 5, 7));System.out.println("""res0: String = """ + $show(res$0));$skip(32); val res$1 = 
  matchTestClass(List(2, 5, 7));System.out.println("""res1: String = """ + $show(res$1));$skip(36); val res$2 = 
  matchTestClass(Map(1 -> "hello"));System.out.println("""res2: String = """ + $show(res$2));$skip(78); 

  // FOR EACH MIT UNDERSCORE
  List(1, 2, 3, 4, 5).foreach(a => println(a));$skip(44); 

  List(1, 2, 3, 4, 5).foreach(println(_))

  //=======================================================================================================

  /**
   * Properties
   *
   * In scala, a getter and setter will be implicitly defined for all non-private var in a object.
   * The getter name is same as the variable name and _= is added for setter name. We can define our
   * own getters and setters. This is looking similar to Ruby getters and setters.
   * Ok lets see an example which uses the getter and setters.
   *
   */

  class Test {
    private var a = 0
    def age = a
    def age_=(n: Int) = {
      require(n > 0)
      a = n * n
    }
  };$skip(645); 

  val t = new Test;System.out.println("""t  : _1_0_underscore.UndersoreMagic.Test = """ + $show(t ));$skip(12); 
  t.age = 5;$skip(17); 
  println(t.age)

  //=======================================================================================================
  /**
   * Functions
   *
   * Scala is a functional language. So we can treat function as a normal variable.
   * If you try to assign a function to a new variable, the function will be invoked and the
   * result will be assigned to the variable. This confusion occurs due to the optional braces
   * for method invocation. We should use _ after the function name to assign it to another variable.
   *
   *
   */

  class Test2 {
    def fun() : Int = {
      1+1
    }
    val funLike = fun _
  };$skip(637); 
  
  val t2 = new Test2;System.out.println("""t2  : _1_0_underscore.UndersoreMagic.Test2 = """ + $show(t2 ));$skip(9); val res$3 = 
  t2.fun;System.out.println("""res3: Int = """ + $show(res$3));$skip(13); val res$4 = 
  t2.funLike;System.out.println("""res4: () => Int = """ + $show(res$4));$skip(244); 
  
  //=======================================================================================================
  
  /**
  	gesonderter Methodenaufruf bei Currying
  */
  
  	def curry(a: Int)(b: Int, c: Int) : Int = {
  		return a + b + c
  	};System.out.println("""curry: (a: Int)(b: Int, c: Int)Int""");$skip(33); val res$5 = 
  
  	//Normal
  	curry(1)(2, 3);System.out.println("""res5: Int = """ + $show(res$5));$skip(52); 
  	//Mit underscore am ende
  	val func = curry(1)_;System.out.println("""func  : (Int, Int) => Int = """ + $show(func ));$skip(13); val res$6 = 
  	func(2,3);System.out.println("""res6: Int = """ + $show(res$6))}
}
