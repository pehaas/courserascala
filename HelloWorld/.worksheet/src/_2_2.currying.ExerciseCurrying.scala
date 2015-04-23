package _2_2.currying

object ExerciseCurrying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(301); 
  //	1.)
  //	Write a product function that calculates the produkt of the values
  //	of function for the points on a given interval
  
  def product(f: Int => Int)(a: Int, b: Int): Int = {
  	if(a > b)
  		1
  	else
  		f(a) * product(f)(a + 1, b)
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(31); val res$0 = 
  
  product( x => x * x)(3,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(94); 
  
  //	2.)
  //	write factorial in term of product
  def fact(n: Int) = product(x => x)(1,n);System.out.println("""fact: (n: Int)Int""");$skip(10); val res$1 = 
  fact(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(291); 
  
  
  
  //	3.)
  //	Can you write a more general function, which generalize both, sum and product
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int):Int = {
  	if( a > b )
  		zero
  	else
  		combine( f(a) , mapReduce(f, combine, zero)(a + 1, b) )
  };System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(91); 

	def product2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x * y, 1)(a, b);System.out.println("""product2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(86); 
	def sum2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x + y, 0)(a, b);System.out.println("""sum2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(30); val res$2 = 
  
  product2(x => x*x)(3,4);System.out.println("""res2: Int = """ + $show(res$2));$skip(22); val res$3 = 
  sum2(x => x*x)(3,4);System.out.println("""res3: Int = """ + $show(res$3))}
  
}
