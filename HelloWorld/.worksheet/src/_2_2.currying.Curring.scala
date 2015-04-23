package _2_2.currying

object Curring {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(573); 
	/*
	Langform:  eine Function die eine Function f(x: Int):Int entgegen nimmt und eine Function( x: Int, y: Int): Int returned
  def sum ( f: Int => Int) : (Int, Int) => Int = {
  	def sumFunction(a: Int, b: Int): Int = {
  		if( a > b)
  			0
  		else
  			f(a) + sumFunction(a+1, b)
  	}
  	sumFunction
  }
  
  def sumInts = sum(x => x)
	def sumCubes = sum(x => x*x*x)
	def sumFact = sum(x => fact(x))
  */
  
  //Kurzform
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
  	if(a > b)
  		0
  	else
  		f(a) + sum(f)(a + 1, b)
  };System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(29); 

	def sumInts = sum(x => x)_;System.out.println("""sumInts: => (Int, Int) => Int""");$skip(33); 
	def sumCubes = sum(x => x*x*x)_;System.out.println("""sumCubes: => (Int, Int) => Int""");$skip(34); 
	def sumFact = sum(x => fact(x))_;System.out.println("""sumFact: => (Int, Int) => Int""");$skip(78); 
	
	
	def fact(n: Int): Int = {
		if(n == 0)
			1
		else
			n *  fact(n -1)
	};System.out.println("""fact: (n: Int)Int""");$skip(16); val res$0 = 
	
	sumFact(5,6);System.out.println("""res0: Int = """ + $show(res$0));$skip(24); val res$1 = 
	//ODER
	sum(fact)(5,6);System.out.println("""res1: Int = """ + $show(res$1));$skip(17); val res$2 = 
	
	sumInts(1,5);System.out.println("""res2: Int = """ + $show(res$2));$skip(26); val res$3 = 
	//ODER
	sum(x => x)(1,5);System.out.println("""res3: Int = """ + $show(res$3));$skip(18); val res$4 = 
	
	sumCubes(2,3);System.out.println("""res4: Int = """ + $show(res$4));$skip(30); val res$5 = 
	//ODER
	sum(x => x*x*x)(2,3);System.out.println("""res5: Int = """ + $show(res$5))}
}
