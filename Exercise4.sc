object Exercise4 {
  var myList4 = List.range(1,46)                  //> myList4  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
                                                  //| , 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34,
                                                  //|  35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45)
  var sumOfNumbersDivisibleByFour = 0             //> sumOfNumbersDivisibleByFour  : Int = 0
  var sumSquareNumbersDivibleByThreee = 0         //> sumSquareNumbersDivibleByThreee  : Int = 0
  for (num <- myList4){
  			if (num % 4 == 0) { sumOfNumbersDivisibleByFour += num}
  			if (num % 3 == 0  && num < 20){ sumSquareNumbersDivibleByThreee += num*num }
  			
  }
  println("Sum of Numbers Divisible By 4 in [ 1,45 ] = " + sumOfNumbersDivisibleByFour)
                                                  //> Sum of Numbers Divisible By 4 in [ 1,45 ] = 264
  println("Sum of Square Of Numbers Divisible By 3 in [ 1,45 ] = " + sumSquareNumbersDivibleByThreee)
                                                  //> Sum of Square Of Numbers Divisible By 3 in [ 1,45 ] = 819
}