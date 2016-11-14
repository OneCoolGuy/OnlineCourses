object exercise {
  def prod(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1 else f(a) * prod(f)( a + 1, b)

  def fact(b: Int): Int =
    if (b == 0) 1 else prod(x => x)(1,b)

  fact(5)

  def abstr(f: Int => Int, start: Int, fun: (Int,Int) => Int)(a: Int, b: Int): Int =
    if (a > b) start else fun(f(a), abstr(f)( a + 1, b))
}
