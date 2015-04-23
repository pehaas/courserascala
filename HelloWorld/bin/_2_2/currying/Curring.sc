package _2_2.currying

object Curring {
	/*
	Langform:  eine Function die eine Function f(x: Int):Int entgegen nimmt und eine Function( x: Int, y: Int): Int returned
  def sum ( f: Int => Int) : (Int, Int) => Int = {
  	def sumFunction(a: Int, b: Int): Int = {
  		if( a > b)
  			0
  		else
  			f(a) + sumFunction(a+1, b)
  	}
  	sumFunction
  }
  
  def sumInts = sum(x => x)
	def sumCubes = sum(x => x*x*x)
	def sumFact = sum(x => fact(x))
  */
  
  //Kurzform
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
  	if(a > b)
  		0
  	else
  		f(a) + sum(f)(a + 1, b)
  }                                               //> sum: (f: Int => Int)(a: Int, b: Int)Int

	def sumInts = sum(x => x)_                //> sumInts: => (Int, Int) => Int
	def sumCubes = sum(x => x*x*x)_           //> sumCubes: => (Int, Int) => Int
	def sumFact = sum(x => fact(x))_          //> sumFact: => (Int, Int) => Int
	
	
	def fact(n: Int): Int = {
		if(n == 0)
			1
		else
			n *  fact(n -1)
	}                                         //> fact: (n: Int)Int
	
	sumFact(5,6)                              //> res0: Int = 840
	//ODER
	sum(fact)(5,6)                            //> res1: Int = 840
	
	sumInts(1,5)                              //> res2: Int = 15
	//ODER
	sum(x => x)(1,5)                          //> res3: Int = 15
	
	sumCubes(2,3)                             //> res4: Int = 35
	//ODER
	sum(x => x*x*x)(2,3)                      //> res5: Int = 35
}