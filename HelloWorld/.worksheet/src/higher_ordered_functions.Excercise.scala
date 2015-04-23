package higher_ordered_functions

import scala.annotation.tailrec
import org.omg.CORBA.Any

object Excercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(505); 
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
  };System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(115); 
  
  
   def sum2(f: Int => Int, a: Int, b: Int):Int = {
  	if(a > b)
  		0
  	else
  		f(a) + sum(f, a+1 , b)
  };System.out.println("""sum2: (f: Int => Int, a: Int, b: Int)Int""");$skip(28); 
  
  def id(x: Int):Int = x;System.out.println("""id: (x: Int)Int""");$skip(31); 
  def cube(x: Int):Int = x*x*x;System.out.println("""cube: (x: Int)Int""");$skip(27); val res$0 = 
  

  
  
  
  sum(id,1,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(30); val res$1 = 
  //ODER
  sum(x => x , 1, 5);System.out.println("""res1: Int = """ + $show(res$1));$skip(21); val res$2 = 
  
  sum(cube, 2, 3);System.out.println("""res2: Int = """ + $show(res$2));$skip(34); val res$3 = 
  //ODER
  sum(x => x*x*x , 2, 3);System.out.println("""res3: Int = """ + $show(res$3))}
  
}
