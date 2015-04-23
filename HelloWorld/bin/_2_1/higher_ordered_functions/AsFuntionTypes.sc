package greeter

object FuntionTypes {
  def toList(i: Int , c: Char ): List[String] = {
  	List(i.toString(),c.toString())
  }                                               //> toList: (i: Int, c: Char)List[String]
  
  toList(1,'c')                                   //> res0: List[String] = List(1, c)
  
  def functionTypeMethod(f: (Int, Char) => List[String], d: Int, c: Char)={
  	println(f(d,c))
  }                                               //> functionTypeMethod: (f: (Int, Char) => List[String], d: Int, c: Char)Unit
  
  functionTypeMethod(toList, 10, 'C')             //> List(10, C)
  
  
  
  //Alle Methoden in HigherOderFunction.sc als FunctionType
  def sum(f: Int => Int, a: Int, b: Int):Int = {
  	if(a > b)
  		0
  	else
  		f(a) + sum(f, a+1 , b)
  }                                               //> sum: (f: Int => Int, a: Int, b: Int)Int
  
  def id(n: Int):Int = n;                         //> id: (n: Int)Int
  def fact(n: Int):Int = if(n == 0) 1 else n * fact(n-1)
                                                  //> fact: (n: Int)Int
  def cube(n: Int):Int = n*n*n                    //> cube: (n: Int)Int
  
  
  sum(id, 1,5)                                    //> res1: Int = 15
 	sum(fact,5,6)                             //> res2: Int = 840
 	sum(cube, 2,3)                            //> res3: Int = 35
}