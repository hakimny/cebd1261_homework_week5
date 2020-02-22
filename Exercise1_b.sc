object Exercise1_b {
   //Exercise1
	 var feb = ""                             //> feb  : String = ""
	 var sum = 0                              //> sum  : Int = 0
	 var sumMinus1 = 0                        //> sumMinus1  : Int = 0
	 var sumMinus2 = 0                        //> sumMinus2  : Int = 0
	 for(x <- 0 to 10){
	 	if (x == 0  || x == 1) { sum = x; feb += sum.toString + " "; sumMinus1 = sum }
	 	else{ sum = sumMinus1  + sumMinus2; feb += sum.toString + " "; sumMinus2 = sumMinus1; sumMinus1 = sum }
	 }
	 println(feb)                             //> 0 1 1 2 3 5 8 13 21 34 55 
}