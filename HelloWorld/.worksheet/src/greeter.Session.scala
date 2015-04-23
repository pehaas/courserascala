package greeter

import math._
import scala.util.control.TailCalls.TailRec
import scala.annotation.tailrec

object Session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(325); 
  def sqrtIter(guess: Double, x: Double): Double = {
    println("guess=" + guess)
    println("x=" + x)
    if (isGoodEnough(guess, x))
      guess
    else
      sqrtIter(improve(guess, x), x)
  };System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(90); 

  def isGoodEnough(guess: Double, x: Double) = {
    abs(guess * guess - x) < 0.001
  };System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(78); 

  def improve(guess: Double, x: Double) = {
    (guess + x / guess) / 2
  };System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(43); 

  def sqrt(x: Double) = sqrtIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(12); val res$0 = 

  sqrt(4);System.out.println("""res0: Double = """ + $show(res$0));$skip(262); 

  var factorialBlock = {
    
    def factorial(n: => Int): Int = {
    	@tailrec
      def loop(acc: Int, n: Int): Int = {
        if (n == 0)
        	acc
        else
        	loop(acc*n, n - 1)
      }
      
      loop(1,n)
    }

    factorial(3)

  };System.out.println("""factorialBlock  : Int = """ + $show(factorialBlock ));$skip(152); 
  val gcdblock = {
    @tailrec
    def gcd(a: Int, b: Int): Int = {
      if (b == 0) a else gcd(b, a % b)
    }

    gcd(10, 6)
    gcd(6, 10)

  };System.out.println("""gcdblock  : Int = """ + $show(gcdblock ))}

		
}
