object Exercise1_a {

  def max(x: Int, y:Int) : Int = {
  		if (x > y)  x else  y
  }                                               //> max: (x: Int, y: Int)Int
  def callMax(x:Int, y:Int, f:(Int,Int) =>Int) : Int = {
  		f(x,y)
  }                                               //> callMax: (x: Int, y: Int, f: (Int, Int) => Int)Int
  
  callMax(3,23,max)                               //> res0: Int = 23
  
  //callMax using lambda fucntion
  callMax(23,20,(x:Int,y:Int) => {if(x > y)  x else y})
                                                  //> res1: Int = 23
}