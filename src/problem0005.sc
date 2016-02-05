/*
  2520 is the smallest number that can be divided by each of the numbers from 1 to 10
  without any remainder.

  What is the smallest positive number that is evenly divisible by all of the numbers
  from 1 to 20?
*/
def stream(i: Long = 20): Stream[Long] = i #:: stream(i + 20)
stream(20).find(x => (1 to 20).forall(y => x % y == 0))