package greeter

object AsAnonymousFunction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(224); 
  
  
  //Alle Methoden in HigherOderFunction.sc als Anonymous Function
  def sum(f: Int => Int, a: Int, b: Int):Int = {
  	if(a > b)
  		0
  	else
  		f(a) + sum(f, a+1 , b)
  };System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(178); 
  
//  def id(n: Int):Int = n;
//  def fact(n: Int):Int = if(n == 0) 1 else n * fact(n-1)
//  def cube(n: Int):Int = n*n*n
  
  
  def sumInts(a: Int, b: Int) = sum(n => n, a,b);System.out.println("""sumInts: (a: Int, b: Int)Int""");$skip(135); 
 	//def sumFact(a: Int, b: Int) = sum(n => if(n == 0) 1 else n * fact(n-1) ,5,6)
 	def sumCube(a: Int, b: Int) = sum(n => n*n*n,  2,3);System.out.println("""sumCube: (a: Int, b: Int)Int""");$skip(21); val res$0 = 
 	
 	
 	sumInts(1,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(32); val res$1 = 
 	//sumFact(5,6)
 	sumCube(2,3);System.out.println("""res1: Int = """ + $show(res$1))}
 	
}
