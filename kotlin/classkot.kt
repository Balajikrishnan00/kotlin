/*
class car{
    var brand =""
    var model=""
    var year=0
}

fun main() {
    var c1=car()
    var c2 =car()
    c1.brand="ford"
    c1.model="Mustang"
    c1.year=1997
    c2.brand="bmw"
    c2.model="i8"
    c2.year=2010
    println(c1.brand)
    println(c1.model)
    println(c1.year)
    println(c2.brand)
    println(c2.model)
    println(c2.year)

    class bike(var name:String,var model:String,var year:Int)
    var b1=bike("yamaha","fz64",2016)
    var b2=bike("bajaj","pulsar",1997)
    println(b1.model+" "+b1.name+" "+b1.year)
    println(b2.name+" "+b2.model+""+b2.year)

} */
class Car(val companyName:String,val modelName:String,var Price:Int,val type:String)

fun main() {
    var car1= Car("BMW" ,"abc",12000000,"Fuel")
    var car2=Car("Audi","xyz",13000000,"Fuel")
    var car3=Car("Tesla","pqr",5800000,"Electric")
    println("1 ${car1.companyName} ${car1.modelName} ${car1.Price} ${car1.type}")
    println("2 ${car2.companyName} ${car2.modelName} ${car2.Price} ${car2.type}")
    println("3 ${car3.companyName} ${car3.modelName} ${car3.Price} ${car3.type}")
    car1.Price=11000000
    println("1 ${car1.companyName} ${car1.modelName} ${car1.Price} ${car1.type}")
}
