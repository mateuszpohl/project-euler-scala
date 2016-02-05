/*
  If we list all the natural numbers below 10 that are multiples
  of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

  Find the sum of all the multiples of 3 or 5 below 1000.
*/
(3 to 9 by 3).union(5 to 9 by 5).distinct.sum
(3 to 999 by 3).union(5 to 999 by 5).distinct.sum
(1 to 999).filter((x) => (x % 3) == 0 || (x % 5) == 0).sum
