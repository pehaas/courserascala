package _1_0_underscore

// imports all the classes in the package matching
import scala.util.matching._
// imports all the members of the object Fun. (static import in java)
// import com.test.Fun._

// imports all the members of the object Fun but renames Foo to Bar
// import com.test.Fun.{ Foo => Bar , _ }

// imports all the members except Foo. To exclude a member rename it to _
// import com.test.Fun.{ Foo => _ , _ }

object UndersoreMagic {

	def person = ("Peter", 35, 92)            //> person: => (String, Int, Int)
	val (name,age,_) = person                 //> name  : String = Peter
                                                  //| age  : Int = 35
	println("Name of the person is "+name+" and he is "+age+" years old")
                                                  //> Name of the person is Peter and he is 35 years old

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "anything other than one and two"
  }                                               //> matchTest: (x: Int)String

  def matchTestClass(x: Any) = {
    x match {
      case List(1, _, _) => " a list with three element and the first element is 1"
      case List(_*)      => " a list with zero or more elements "
      case _             => "anything other"
    }
  }                                               //> matchTestClass: (x: Any)String

  matchTestClass(List(1, 5, 7))                   //> res0: String = " a list with three element and the first element is 1"
  matchTestClass(List(2, 5, 7))                   //> res1: String = " a list with zero or more elements "
  matchTestClass(Map(1 -> "hello"))               //> res2: String = anything other

  // FOR EACH MIT UNDERSCORE
  List(1, 2, 3, 4, 5).foreach(a => println(a))    //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5

  List(1, 2, 3, 4, 5).foreach(println(_))         //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5

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
  }

  val t = new Test                                //> t  : _1_0_underscore.UndersoreMagic.Test = _1_0_underscore.UndersoreMagic$$
                                                  //| anonfun$main$1$Test$1@315b5b68
  t.age = 5
  println(t.age)                                  //> 25

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
  }
  
  val t2 = new Test2                              //> t2  : _1_0_underscore.UndersoreMagic.Test2 = _1_0_underscore.UndersoreMagic
                                                  //| $$anonfun$main$1$Test2$1@36073976
  t2.fun                                          //> res3: Int = 2
  t2.funLike                                      //> res4: () => Int = <function0>
  
  //=======================================================================================================
  
  /**
  	gesonderter Methodenaufruf bei Currying
  */
  
  	def curry(a: Int)(b: Int, c: Int) : Int = {
  		return a + b + c
  	}                                         //> curry: (a: Int)(b: Int, c: Int)Int
  
  	//Normal
  	curry(1)(2, 3)                            //> res5: Int = 6
  	//Mit underscore am ende
  	val func = curry(1)_                      //> func  : (Int, Int) => Int = <function2>
  	func(2,3)                                 //> res6: Int = 6
}