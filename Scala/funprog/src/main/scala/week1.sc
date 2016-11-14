def abs(x:Double) = if (x < 0) -x else x

def sqrt(x: Double) = {
  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double) =
    abs(guess * guess - x) < x * 0.00001

  def improve(guess: Double) = (guess + x / guess) / 2

  sqrtIter(1.0)
}


sqrt(4)
sqrt(2)
sqrt(0.001)
sqrt(1e-6)
sqrt(1.0e20)
sqrt(1e60)

def factorial(x: Int): Int = {

  def factIter(sum : Int, x : Int): Int =
    if (x == 0)
      sum
    else if (x == 1)
      sum
    else
      factIter(sum * x, x - 1)

  factIter(1,x)

}

factorial(4)
factorial(2)
factorial(1)
factorial(0)
