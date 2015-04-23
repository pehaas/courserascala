package _2_7_functions_and_data

object InfixOperator {
  
  val r13 = new Rational(1,3)                     //> r13  : _2_7_functions_and_data.Rational = 1/3
  val r32 = new Rational(3,2)                     //> r32  : _2_7_functions_and_data.Rational = 3/2
  
  //Instead of writing r12.add(r32) you can do the following
  r13 add r32                                     //> res0: _2_7_functions_and_data.Rational = 11/6
	
	
	
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
		 
	
	def greatesCommonDenom(y: Int): Int = {
		denom * y
	}
	
  override def toString = {
    numer + "/" + denom
  }
  
}