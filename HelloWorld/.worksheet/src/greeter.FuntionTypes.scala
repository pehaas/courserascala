package greeter

object FuntionTypes {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(217); 
  
  
  //Alle Methoden in HigherOderFunction.sc als Anonymous Function
  def sum(f: Int => Int, a: Int, b: Int):Int = {
  	if(a > b)
  		0
  	else
  		f(a) + sum(f, a+1 , b)
  };System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(159); 
  
//  def id(n: Int):Int = n;
//  def fact(n: Int):Int = if(n == 0) 1 else n * fact(n-1)
//  def cube(n: Int):Int = n*n*n
  
  
  def sumInts = (n => n, 1,5);System.out.println("""sumInts: => (<error> => <error>, Int, Int)""");$skip(60); 
 	def sumFact = (n => if(n == 0) 1 else n * fact(n-1) ,5,6);System.out.println("""sumFact: => (<error> => Int, Int, Int)""");$skip(35); 
 	def sumCube = (n => n*n*n,  2,3);System.out.println("""sumCube: => (<error> => <error>, Int, Int)""");$skip(21); val res$0 = 
 	
 	
 	sumInts(1,5);System.out.println("""res0: <error> = """ + $show(res$0));$skip(15); val res$1 = 
 	sumFact(5,6);System.out.println("""res1: <error> = """ + $show(res$1));$skip(15); val res$2 = 
 	sumCube(2,3);System.out.println("""res2: <error> = """ + $show(res$2))}
 	
}
