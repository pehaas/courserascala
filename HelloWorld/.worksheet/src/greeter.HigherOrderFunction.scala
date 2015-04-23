package greeter

object HigherOrderFunction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(185); 

	/**
		sum of integer between a and b
	*/
  def sumsInts(a: Int, b: Int):Int = {
  	if( a > b)
  		0
  	else
  		a+ sumsInts( a+1 , b)
  };System.out.println("""sumsInts: (a: Int, b: Int)Int""");$skip(21); val res$0 = 
  //
  sumsInts(1,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(30); 
  
  def cube(x: Int) = x*x*x;System.out.println("""cube: (x: Int)Int""");$skip(103); 
  
  def sumCube(a: Int, b: Int): Int = {
  	if(a > b)
  		0
  	else
  		cube(a) + sumCube(a+1, b)
  };System.out.println("""sumCube: (a: Int, b: Int)Int""");$skip(19); val res$1 = 
  
  sumCube(2, 3);System.out.println("""res1: Int = """ + $show(res$1));$skip(89); 
  
  
  
  
  def fact(n: Int): Int ={
  	if(n == 0)
  		1
  	else
  		n * fact(n-1)
  };System.out.println("""fact: (n: Int)Int""");$skip(115); 
  
  def sumFaktorials(a: Int, b: Int): Int = {
  	if(a > b)
  		0
  	else
  		fact(a) + sumFaktorials(a+1, b)
  };System.out.println("""sumFaktorials: (a: Int, b: Int)Int""");$skip(25); val res$2 = 
  
  sumFaktorials(5, 6);System.out.println("""res2: Int = """ + $show(res$2))}
  
  
  
  
}
