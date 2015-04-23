package _2_3_finding_fixed_points

object FindingFixedPoints {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(164); 
  //A number x is called a fixed point of a function f if
  //f(x) = x
  
  
  val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(91); 
  def isCloseEnough(x: Double, y: Double) = {
  	Math.abs( (x-y) / x ) / x < tolerance
  };System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(237); 
  
  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  	def iterate(guess: Double): Double = {
  		val next = f(guess)
  		if(isCloseEnough(guess, next))
  			next
  		else
  			iterate(next);
  	}
  	iterate(firstGuess)
  };System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(33); val res$0 = 
  
  fixedPoint(x => 1 + x/2)(1);System.out.println("""res0: Double = """ + $show(res$0));$skip(70); 
  
  
  
  def sqrt(x: Double) = fixedPoint(y => (y + x / y) / 2 )(1);System.out.println("""sqrt: (x: Double)Double""");$skip(10); val res$1 = 
  sqrt(2);System.out.println("""res1: Double = """ + $show(res$1))}
}
