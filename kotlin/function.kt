fun fun1(){
    println("Balaji")
}
fun fun2(){
    println("Krishnan")
}
fun fun3(fname:String){

    println(fname+"doe")
}
fun fun4(fname:String,age:Int){
    println(fname +" is "+ age)
}
fun fun5(x:Int,y:Int):Int{
    return (x+y)
}
fun fun6(a:Int,b:Int)=a+b


fun main() {
    fun1()
    fun2()
    fun3("balaji")
    fun4("balaji",age=24)

    var res1=fun5(10,20)
    println(res1)
    var res2=fun6(10,50)
    println(res2)
}

