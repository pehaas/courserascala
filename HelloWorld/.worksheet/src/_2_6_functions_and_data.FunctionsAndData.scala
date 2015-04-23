package _2_6_functions_and_data

object FunctionsAndData {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  
  val r13 = new Rational(1,3);System.out.println("""r13  : _2_6_functions_and_data.Rational = """ + $show(r13 ));$skip(30); 
  val r32 = new Rational(3,2);System.out.println("""r32  : _2_6_functions_and_data.Rational = """ + $show(r32 ));$skip(19); val res$0 = 
  
  r13.sub(r32);System.out.println("""res0: _2_6_functions_and_data.Rational = """ + $show(res$0));$skip(15); val res$1 = 
  r13.add(r32);System.out.println("""res1: _2_6_functions_and_data.Rational = """ + $show(res$1));$skip(102); 
  // 1.) add method for calculating gcd (greatest common denomenator)
  val r126 = new Rational(12,6);System.out.println("""r126  : _2_6_functions_and_data.Rational = """ + $show(r126 ));$skip(94); val res$2 = 

	// 2.) write a less method determing if this Rational is less than the given
	r13.less(r32);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(15); val res$3 = 
	r32.less(r13);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(54); val res$4 = 
	
	// 3.) define a mex method returning
	r32.max(r13);System.out.println("""res4: _2_6_functions_and_data.Rational = """ + $show(res$4));$skip(364); 
	
	// 4.) what happens when you du the folowing
	//     	val r10 = new Rational(1,0)
  //			r10.add(r10)
	//val r10 = new Rational(1,0)
	//r10.add(r10)
                                                  
	//4.1 convert the exception to IllegalArgument exception by using require
	
	//5 add a second constructor which takes only the numer
	val r21 = new Rational(2);System.out.println("""r21  : _2_6_functions_and_data.Rational = """ + $show(r21 ))}
	
}

class Rational(initNumer: Int, initDenom: Int) {
	require(initDenom != 0, "denom must be non zero!")
  
  val numer = initNumer / gcd(initNumer,initDenom) // Zaehler
  val denom = initDenom / gcd(initNumer,initDenom)// Nenner
  
  def this(initNumer: Int) = this(initNumer,1)
  
  private def gcd(a: Int, b: Int): Int = {
  	if( b == 0 ){
  		a
  		}
  	else
  		gcd(b, a % b)
  }

	def less(r: Rational) = numer * r.denom < r.numer *  denom
	
	def max(r: Rational) = {
		if(less(r))
			r
		else
			this
	}
	
  def add(r: Rational) = {
    new Rational(
      numer * r.denom + r.numer * denom,
      denom * r.denom
    )
  }
	
	def neg(): Rational = {
		new Rational( numer * -1 , denom )
	}
	
	def sub(r: Rational): Rational = add(r.neg)
		 
	
  override def toString = {
    numer + "/" + denom
  }
  
}
