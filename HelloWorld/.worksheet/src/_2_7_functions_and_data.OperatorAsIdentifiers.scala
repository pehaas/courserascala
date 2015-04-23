package _2_7_functions_and_data

object OperatorAsIdentifiers {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(97); 
  
  val r13 = new Rational(1,3);System.out.println("""r13  : _2_7_functions_and_data.Rational = """ + $show(r13 ));$skip(30); 
  val r32 = new Rational(3,2);System.out.println("""r32  : _2_7_functions_and_data.Rational = """ + $show(r32 ));$skip(162); val res$0 = 
  
  //In Scale every Symbol can be used as Identifier
  //i.e. x1	,	*	,	+?%& , vector_++, counter_=  would all be valid method or variable names
  
  r13.+(r32);System.out.println("""res0: _2_7_functions_and_data.Rational = """ + $show(res$0));$skip(21); val res$1 = 
  //ODER
  r13 + r32;System.out.println("""res1: _2_7_functions_and_data.Rational = """ + $show(res$1));$skip(16); val res$2 = 
  
  r13.-(r32);System.out.println("""res2: _2_7_functions_and_data.Rational = """ + $show(res$2));$skip(21); val res$3 = 
  //ODER
  r13 - r32;System.out.println("""res3: _2_7_functions_and_data.Rational = """ + $show(res$3));$skip(16); val res$4 = 
  
  r13.<(r32);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(21); val res$5 = 
  //ODER
  r13 < r32;System.out.println("""res5: Boolean = """ + $show(res$5));$skip(19); val res$6 = 
  
  r13.unary_-();System.out.println("""res6: _2_7_functions_and_data.Rational = """ + $show(res$6));$skip(16); val res$7 = 
  //ODER
  -r13;System.out.println("""res7: _2_7_functions_and_data.Rational = """ + $show(res$7))}
	
	
	
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

	def < (r: Rational) = numer * r.denom < r.numer *  denom
	
	def max(r: Rational) = {
		if(this < r)
			r
		else
			this
	}
	
  def +(r: Rational) = {
    new Rational(
      numer * r.denom + r.numer * denom,
      denom * r.denom
    )
  }
	
	def unary_- (): Rational = {
		new Rational( -numer  , denom )
	}
	
	def -(r: Rational): Rational = this + -r
	
  override def toString = {
    numer + "/" + denom
  }
  
}
