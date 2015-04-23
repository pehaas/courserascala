package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
     if(c < 0 || r < 0)
       throw new IllegalArgumentException("neither row nor column must be null")
    
     if (c == 0 || c == r) 
       1
     else 
       pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
  

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
      
    
    def balance_aux(chars: List[Char], openCnt: Int): Boolean ={
        if(chars.isEmpty || openCnt < 0)
          openCnt == 0
        else {
          balance_aux( chars.tail , openCnt + checkParanthese(chars.head) )
        }
    }
    
    def checkParanthese(char: Char) :Int = {
          char match {
            case ')' => -1
            case '(' => 1
            case _ => 0
          }
    }

    if(chars == null)
  	  throw new IllegalArgumentException("list of chars must not be null")
  	else
      balance_aux(chars,0)
     
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    
    def countChangeHelper(money: Int, coins: List[Int]): Int = {
      if( coins.isEmpty || money < 0)
        0
      else if( money == 0)
        1
      else 
        countChangeHelper(money - coins.head,  coins) + countChange(money, coins.tail)
    }
    
    if(coins == null || money <= 0)
      0
    else
      countChangeHelper(money, coins);
  }
  
  
}
