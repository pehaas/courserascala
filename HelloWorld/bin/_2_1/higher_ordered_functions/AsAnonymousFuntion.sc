package greeter

object AsAnonymousFunction {
  
  
  //Alle Methoden in HigherOderFunction.sc als Anonymous Function
  def sum(f: Int => Int, a: Int, b: Int):Int = {
  	if(a > b)
  		0
  	else
  		f(a) + sum(f, a+1 , b)
  }                                               //> sum: (f: Int => Int, a: Int, b: Int)Int
  
//  def id(n: Int):Int = n;
//  def fact(n: Int):Int = if(n == 0) 1 else n * fact(n-1)
//  def cube(n: Int):Int = n*n*n
  
  
  def sumInts(a: Int, b: Int) = sum(n => n, a,b)  //> sumInts: (a: Int, b: Int)Int
 	//def sumFact(a: Int, b: Int) = sum(n => if(n == 0) 1 else n * fact(n-1) ,5,6)
 	def sumCube(a: Int, b: Int) = sum(n => n*n*n,  2,3)
                                                  //> sumCube: (a: Int, b: Int)Int
 	
 	
 	sumInts(1,5)                              //> res0: Int = 15
 	//sumFact(5,6)
 	sumCube(2,3)                              //> res1: Int = 35
 	
}