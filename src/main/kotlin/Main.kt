fun main() {
    var num=modulus(40 ,32)
    println(num)
    var x=sum(32,23,6,0)
    println(x)
    var r=surname("rehema+" ,"ephraim")
    println(r)

}
fun modulus(num1: Int, num2: Int):Int{
    var reminder = num1%num2
    return reminder

}
fun sum(num1: Int, num2: Int, num3: Int, num4: Int):Int{
    var add= num1+num2+num3+num4
    return add
}
fun surname(firstName: String, secondName: String):String{
    var name=firstName+secondName
    return (name)
}