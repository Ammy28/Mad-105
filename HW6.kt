fun areaOfCircle(r:Int):Double{
    var area:Double = 3.14*(r*r)
    return area}
fun areaOfTriangle(b:Int,h:Int):Double{
    var area:Double = 0.5 * (b * h)
    return area
}
fun areaOfRectangle(w:Int,h:Int):Double{
    var area:Double = w * h + 0.0
    return area}
fun areaOfEllipse(a:Int, b:Int):Double{
    var area =3.14*a*b
    return area}
fun main(){
    println("Enter 1-4\n" +
            "1:Find area of a circle\n" +
            "2:Find area of a Triangle\n" +
            "3:Find area of a Rectangle\n" +
            "4:Find area of an Ellipse")
    var area = 0.0
do{
    var choose = readLine()!!.toInt()
    area = 0.0
    when(choose){
    1->{ println("Enter radius")
        var r=readLine()!!.toInt()
        area=areaOfCircle(r)}
    2->{println("Enter base")
        var b= readLine()!!.toInt()
        println("Enter height")
        var h=readLine()!!.toInt()
        area=areaOfTriangle(b,h)}
    3->{println("Enter width")
        var w=readLine()!!.toInt()
        println("Enter height")
        var h=readLine()!!.toInt()
        area=areaOfRectangle(w,h)}
    4->{println("Enter length 1")
        var a=readLine()!!.toInt()
        println("Enter length 2")
        var b =readLine()!!.toInt()
        area=areaOfEllipse(a,b)}
    else->{
        println("That is not a valid option try again")
        choose = -1}
    }

}while(choose == -1)
    println("The area is $area")
}
