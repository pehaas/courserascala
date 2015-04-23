package _2_5_functions_and_data

object FunctionsAndData {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  val r1 = new Rational(1, 2);System.out.println("""r1  : _2_5_functions_and_data.Rational = """ + $show(r1 ));$skip(30); 
  val r2 = new Rational(2, 3);System.out.println("""r2  : _2_5_functions_and_data.Rational = """ + $show(r2 ));$skip(11); val res$0 = 
  r1.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(11); val res$1 = 
  r1.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(160); 

  def addRational(r1: Rational, r2: Rational): Rational = {
    new Rational(
      r1.numer * r2.denom + r2.numer * r1.denom,
      r1.denom * r2.denom)
  };System.out.println("""addRational: (r1: _2_5_functions_and_data.Rational, r2: _2_5_functions_and_data.Rational)_2_5_functions_and_data.Rational""");$skip(68); 

  def makeString(r: Rational) = {
    r.numer + "/" + r.denom
  };System.out.println("""makeString: (r: _2_5_functions_and_data.Rational)String""");$skip(36); val res$2 = 

  makeString(addRational(r1, r2));System.out.println("""res2: String = """ + $show(res$2));$skip(34); val res$3 = 

  r1.addRational(r2).toString();System.out.println("""res3: String = """ + $show(res$3));$skip(32); val res$4 = 
  r1.subRational(r2).toString();System.out.println("""res4: String = """ + $show(res$4));$skip(110); 
  
  // add a sub Method to Rational.class
  // add a neg Method x becomes -x
  
  val r3 = new Rational(1,3);System.out.println("""r3  : _2_5_functions_and_data.Rational = """ + $show(r3 ));$skip(29); 
  val r4 = new Rational(5,7);System.out.println("""r4  : _2_5_functions_and_data.Rational = """ + $show(r4 ));$skip(29); 
  val r5 = new Rational(3,2);System.out.println("""r5  : _2_5_functions_and_data.Rational = """ + $show(r5 ));$skip(37); val res$5 = 
  r3.subRational(r4).subRational(r5);System.out.println("""res5: _2_5_functions_and_data.Rational = """ + $show(res$5))}

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
