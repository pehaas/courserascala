package greeter

object HigherOrderFunction {

	/**
		sum of integer between a and b
	*/
  def sumsInts(a: Int, b: Int):Int = {
  	if( a > b)
  		0
  	else
  		a+ sumsInts( a+1 , b)
  }                                               //> sumsInts: (a: Int, b: Int)Int
  //
  sumsInts(1,5)                                   //> res0: Int = 15
  
  def cube(x: Int) = x*x*x                        //> cube: (x: Int)Int
  
  def sumCube(a: Int, b: Int): Int = {
  	if(a > b)
  		0
  	else
  		cube(a) + sumCube(a+1, b)
  }                                               //> sumCube: (a: Int, b: Int)Int
  
  sumCube(2, 3)                                   //> res1: Int = 35
  
  
  
  
  def fact(n: Int): Int ={
  	if(n == 0)
  		1
  	else
  		n * fact(n-1)
  }                                               //> fact: (n: Int)Int
  
  def sumFaktorials(a: Int, b: Int): Int = {
  	if(a > b)
  		0
  	else
  		fact(a) + sumFaktorials(a+1, b)
  }                                               //> sumFaktorials: (a: Int, b: Int)Int
  
  sumFaktorials(5, 6)                             //> res2: Int = 840
  
  
  
  
}