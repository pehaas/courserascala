package higher_ordered_functions

import scala.annotation.tailrec
import org.omg.CORBA.Any

object Excercise {
  /*
  Write a tail-recursive version
  def sum(f: Int => Int, a: Int, b: Int): Int = {
  	def loop(a: Int, acc: Int): Int = {
  		if(???)
  			???
  		else
  			loop(???, ???)
  	}
  	loop(???,???)
  }
  */
  
  
  def sum(f: Int => Int, a: Int, b: Int): Int = {
  	@tailrec
  	def loop(a: Int, acc: Int): Int = {
  		if(a > b)
  			acc
  		else
  			loop(a+1, acc+f(a))
  	}
  	loop(a,0)
  }                                               //> sum: (f: Int => Int, a: Int, b: Int)Int
  
  
   def sum2(f: Int => Int, a: Int, b: Int):Int = {
  	if(a > b)
  		0
  	else
  		f(a) + sum(f, a+1 , b)
  }                                               //> sum2: (f: Int => Int, a: Int, b: Int)Int
  
  def id(x: Int):Int = x                          //> id: (x: Int)Int
  def cube(x: Int):Int = x*x*x                    //> cube: (x: Int)Int
  

  
  
  
  sum(id,1,5)                                     //> res0: Int = 15
  //ODER
  sum(x => x , 1, 5)                              //> res1: Int = 15
  
  sum(cube, 2, 3)                                 //> res2: Int = 35
  //ODER
  sum(x => x*x*x , 2, 3)                          //> res3: Int = 35
  
}