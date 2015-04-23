package _2_5_functions_and_data

object FunctionsAndData {
  val r1 = new Rational(1, 2)                     //> r1  : _2_5_functions_and_data.Rational = 1/2
  val r2 = new Rational(2, 3)                     //> r2  : _2_5_functions_and_data.Rational = 2/3
  r1.numer                                        //> res0: Int = 1
  r1.denom                                        //> res1: Int = 2

  def addRational(r1: Rational, r2: Rational): Rational = {
    new Rational(
      r1.numer * r2.denom + r2.numer * r1.denom,
      r1.denom * r2.denom)
  }                                               //> addRational: (r1: _2_5_functions_and_data.Rational, r2: _2_5_functions_and_d
                                                  //| ata.Rational)_2_5_functions_and_data.Rational

  def makeString(r: Rational) = {
    r.numer + "/" + r.denom
  }                                               //> makeString: (r: _2_5_functions_and_data.Rational)String

  makeString(addRational(r1, r2))                 //> res2: String = 7/6

  r1.addRational(r2).toString()                   //> res3: String = 7/6
  r1.subRational(r2).toString()                   //> res4: String = -1/6
  
  // add a sub Method to Rational.class
  // add a neg Method x becomes -x
  
  val r3 = new Rational(1,3)                      //> r3  : _2_5_functions_and_data.Rational = 1/3
  val r4 = new Rational(5,7)                      //> r4  : _2_5_functions_and_data.Rational = 5/7
  val r5 = new Rational(3,2)                      //> r5  : _2_5_functions_and_data.Rational = 3/2
  r3.subRational(r4).subRational(r5)              //> res5: _2_5_functions_and_data.Rational = -79/42

}

class Rational(x: Int, y: Int) {
  def numer = x // Zaehler
  def denom = y // Nenner

  def addRational(r: Rational) = {
    new Rational(
      numer * r.denom + r.numer * denom,
      denom * r.denom
    )
  }
	
	def neg(): Rational = {
		new Rational( numer * -1 , denom )
	}
	
	def subRational(r: Rational): Rational = addRational(r.neg)
		 
	
  override def toString = {
    numer + "/" + denom
  }

}