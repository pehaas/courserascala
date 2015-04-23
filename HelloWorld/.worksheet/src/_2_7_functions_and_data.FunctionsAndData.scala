package _2_7_functions_and_data

object FunctionsAndData {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  
  val r13 = new Rational(1,3);System.out.println("""r13  : _2_7_functions_and_data.Rational = """ + $show(r13 ));$skip(30); 
  val r32 = new Rational(3,2);System.out.println("""r32  : _2_7_functions_and_data.Rational = """ + $show(r32 ))}
	
}

class Rational(initNumer: Int, initDenom: Int) {
	require(initDenom != 0, "denom must be non zero!")
  
  val numer = initNumer / gcd(initNumer,initDenom) // Zaehler
  val denom = initDenom / gcd(initNumer,initDenom)// Nenner
  
  def this(initNumer: Int) = this(initNumer,1)
  
  private def gcd(a: Int, b: Int): Int = {
  	if( b == 0 ){
  		println(a)
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
		 
	
	def greatesCommonDenom(y: Int): Int = {
		denom * y
	}
	
  override def toString = {
    numer + "/" + denom
  }
  
}
