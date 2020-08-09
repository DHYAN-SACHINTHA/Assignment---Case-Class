import math.{sqrt,pow}

object MyApp extends App{
    val p1 =  Point(2,3)
    val p2 =  Point(5,4)
    val p3 = p1.move(2,3)
    val p4 = p1.distance(p2)
    val p5 = Point(10,9)
    val p6 = p5.invert()

    println("p1="+p1)
    println("p2="+p2)
    println("move p1 by (2,3)="+p3)
    println("Add the p1 and p2="+p1+p2)
    println("Distance of p1 and p2="+p4)
    println("Invert the (10,9)="+p6)

}
 case class Point(a:Int,b:Int){
     def x:Int=a
     def y:Int=b

    //Q01
    def +(that:Point) = Point(this.x+that.x,this.y+that.y)

    //Q02
    def move(dx:Int,dy:Int) = Point(this.x+dx,this.y+dy)

    //Q03
    def distance(a:Point):Double = sqrt(pow(x-a.x,2)+pow(y-a.y,2))

    //Q04
    def invert() = Point(y,x)

 }
 