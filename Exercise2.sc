object Exercise2 {
 	 def factorial(y:Int) : Int = {
 	 	var fact:Int = 1
 		for (x <- 1 to y) {fact = fact * x}
 		fact
 	 }                                        //> factorial: (y: Int)Int
 	println( factorial(6))                    //> 720
 	 
 	def callFactorial(x:Int, f:Int => Int) :Int = {
 		factorial(x)
 	}                                         //> callFactorial: (x: Int, f: Int => Int)Int
 	callFactorial(6,factorial)                //> res0: Int = 720
  
}