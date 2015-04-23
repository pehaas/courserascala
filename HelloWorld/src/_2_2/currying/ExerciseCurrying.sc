package _2_2.currying

object ExerciseCurrying {
  //	1.)
  //	Write a product function that calculates the produkt of the values
  //	of function for the points on a given interval
  
  def product(f: Int => Int)(a: Int, b: Int): Int = {
  	if(a > b)
  		1
  	else
  		f(a) * product(f)(a + 1, b)
  }                                               //> product: (f: Int => Int)(a: Int, b: Int)Int
  
  product( x => x * x)(3,4)                       //> res0: Int = 144
  
  //	2.)
  //	write factorial in term of product
  def fact(n: Int) = product(x => x)(1,n)         //> fact: (n: Int)Int
  fact(5)                                         //> res1: Int = 120
  
  
  
  //	3.)
  //	Can you write a more general function, which generalize both, sum and product
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int):Int = {
  	if( a > b )
  		zero
  	else
  		combine( f(a) , mapReduce(f, combine, zero)(a + 1, b) )
  }                                               //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int

	def product2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x * y, 1)(a, b)
                                                  //> product2: (f: Int => Int)(a: Int, b: Int)Int
	def sum2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x + y, 0)(a, b)
                                                  //> sum2: (f: Int => Int)(a: Int, b: Int)Int
  
  product2(x => x*x)(3,4)                         //> res2: Int = 144
  sum2(x => x*x)(3,4)                             //> res3: Int = 25
  
}