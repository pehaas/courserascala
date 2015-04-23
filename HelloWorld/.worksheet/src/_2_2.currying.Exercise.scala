package _2_2.currying

object Exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(283); 
  //Write a product function that calculates the produkt of the values
  // of function for the points on a given interval
  
  def product(f: Int => Int)(a: Int, b: Int): Int = {
  	if(a > b)
  		1
  	else
  		f(a) * product(f)(a + 1, b)
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(31); val res$0 = 
  
  product( x => x * x)(3,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(84); 
  
  //write factorial in term of product
  def fact(n: Int) = product(x => x)(1,n);System.out.println("""fact: (n: Int)Int""");$skip(10); val res$1 = 
  fact(5);System.out.println("""res1: Int = """ + $show(res$1))}
  
}
