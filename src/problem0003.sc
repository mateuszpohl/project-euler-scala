/*
  The prime factors of 13195 are 5, 7, 13 and 29.

  What is the largest prime factor of the number 600851475143 ?
*/
def primeFactor(n: Long, p: Long): Long = if (n % p == 0) p else primeFactor(n, p + 1)
def findPrimeFactors(n: Long): List[Long] = {
  var current = n
  var result: List[Long] = List()
  while (current != 1) {
    result =  result :+ primeFactor(current, 2)
    current = current / result.last
  }

  result
}
findPrimeFactors(13195)
findPrimeFactors(600851475143L)