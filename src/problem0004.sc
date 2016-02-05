/*
  A palindromic number reads the same both ways. The largest palindrome made from
  the product of two 2-digit numbers is 9009 = 91 × 99.

  Find the largest palindrome made from the product of two 3-digit numbers.
*/
(100 to 999).flatMap(n => (100 to 999).map( m => n*m)).filter( value => value.toString == value.toString.reverse).max