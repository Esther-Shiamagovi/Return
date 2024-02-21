fun main() {
    printName( name="Hello")
  var division =modulus(170,40)
    println(division)
    var z=add(4,8,2,6)
    println(z)
    interest()
}
 fun printName(name:String){
     var name=("${name}")
     name="Esther"
     println("Hello${name}")
 }
fun modulus(x:Int,y:Int):Int{
    var x=170
    var y=40
    var division=170%40
    return division
}
fun add(num1:Int,num2:Int,num3:Int,num4:Int):Int{
   var sum=num1+num2+num3+num4
    return sum

}
fun interest(){
    var interest="I Enjoy RND music"
    interest="I Enjooy RND Music"
    println(interest)
}

