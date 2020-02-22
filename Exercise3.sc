object Exercise3_a {
//a
 def factorialList(x:List[Int]) : Int = {
 	var fact:Int = 1
 	for (n <- x) {fact = fact * n}
 		fact
 	}                                         //> factorialList: (x: List[Int])Int
 	factorialList(List(1,2,3,4,5))            //> res0: Int = 120
 	factorialList(List.range(1, 10))          //> res1: Int = 362880
 	/*
 	
 	val myList = List(1,2,3,4,5)
 	val res = myList.reduce((x, y) => x * y)
 	*/
 	//b
 	val myList2:List[Int] = List.range(1,6)   //> myList2  : List[Int] = List(1, 2, 3, 4, 5)
 	val res = myList2.reduce((x, y) => x * y) //> res  : Int = 120
 	
 	//c
 	def generateList(x:Int) : List[Int] = {
 		List.range(1,x+1)
 	}                                         //> generateList: (x: Int)List[Int]
 	
 	val res3 = generateList(7).reduce((x, y) => x * y)
                                                  //> res3  : Int = 5040
}