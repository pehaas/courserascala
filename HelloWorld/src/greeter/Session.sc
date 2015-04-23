package greeter

import math._
import scala.util.control.TailCalls.TailRec
import scala.annotation.tailrec

object Session {
  def sqrtIter(guess: Double, x: Double): Double = {
    println("guess=" + guess)
    println("x=" + x)
    if (isGoodEnough(guess, x))
      guess
    else
      sqrtIter(improve(guess, x), x)
  }                                               //> sqrtIter: (guess: Double, x: Double)Double

  def isGoodEnough(guess: Double, x: Double) = {
    abs(guess * guess - x) < 0.001
  }                                               //> isGoodEnough: (guess: Double, x: Double)Boolean

  def improve(guess: Double, x: Double) = {
    (guess + x / guess) / 2
  }                                               //> improve: (guess: Double, x: Double)Double

  def sqrt(x: Double) = sqrtIter(1.0, x)          //> sqrt: (x: Double)Double

  sqrt(4)                                         //> guess=1.0
                                                  //| x=4.0
                                                  //| guess=2.5
                                                  //| x=4.0
                                                  //| guess=2.05
                                                  //| x=4.0
                                                  //| guess=2.000609756097561
                                                  //| x=4.0
                                                  //| guess=2.0000000929222947
                                                  //| x=4.0
                                                  //| res0: Double = 2.0000000929222947

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

  }                                               //> factorialBlock  : Int = 6
  val gcdblock = {
    @tailrec
    def gcd(a: Int, b: Int): Int = {
      if (b == 0) a else gcd(b, a % b)
    }

    gcd(10, 6)
    gcd(6, 10)

  }                                               //> gcdblock  : Int = 2

		
}