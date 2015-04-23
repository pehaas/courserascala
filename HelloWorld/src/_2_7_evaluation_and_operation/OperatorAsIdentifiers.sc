package _2_7_functions_and_data

object OperatorAsIdentifiers {
  
  val r13 = new Rational(1,3)                     //> r13  : _2_7_functions_and_data.Rational = 1/3
  val r32 = new Rational(3,2)                     //> r32  : _2_7_functions_and_data.Rational = 3/2
  
  //In Scale every Symbol can be used as Identifier
  //i.e. x1	,	*	,	+?%& , vector_++, counter_=  would all be valid method or variable names
  
  r13.+(r32)                                      //> res0: _2_7_functions_and_data.Rational = 11/6
  //ODER
  r13 + r32                                       //> res1: _2_7_functions_and_data.Rational = 11/6
  
  r13.-(r32)                                      //> res2: _2_7_functions_and_data.Rational = 7/-6
  //ODER
  r13 - r32                                       //> res3: _2_7_functions_and_data.Rational = 7/-6
  
  r13.<(r32)                                      //> res4: Boolean = true
  //ODER
  r13 < r32                                       //> res5: Boolean = true
  
  r13.unary_-()                                   //> res6: _2_7_functions_and_data.Rational = 1/-3
  //ODER
  -r13                                            //> res7: _2_7_functions_and_data.Rational = 1/-3
	
	
	
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