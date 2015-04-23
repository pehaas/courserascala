package _2_6_functions_and_data

object FunctionsAndData {
  
  val r13 = new Rational(1,3)                     //> r13  : _2_6_functions_and_data.Rational = 1/3
  val r32 = new Rational(3,2)                     //> r32  : _2_6_functions_and_data.Rational = 3/2
  
  r13.sub(r32)                                    //> res0: _2_6_functions_and_data.Rational = 7/-6
  r13.add(r32)                                    //> res1: _2_6_functions_and_data.Rational = 11/6
  // 1.) add method for calculating gcd (greatest common denomenator)
  val r126 = new Rational(12,6)                   //> r126  : _2_6_functions_and_data.Rational = 2/1

	// 2.) write a less method determing if this Rational is less than the given
	r13.less(r32)                             //> res2: Boolean = true
	r32.less(r13)                             //> res3: Boolean = false
	
	// 3.) define a mex method returning
	r32.max(r13)                              //> res4: _2_6_functions_and_data.Rational = 3/2
	
	// 4.) what happens when you du the folowing
	//     	val r10 = new Rational(1,0)
  //			r10.add(r10)
	//val r10 = new Rational(1,0)
	//r10.add(r10)
                                                  
	//4.1 convert the exception to IllegalArgument exception by using require
	
	//5 add a second constructor which takes only the numer
	val r21 = new Rational(2)                 //> r21  : _2_6_functions_and_data.Rational = 2/1
	
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