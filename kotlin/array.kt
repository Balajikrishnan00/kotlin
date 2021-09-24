fun main() {
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
   /* println(cars[0])
    println(cars[1])
    println(cars[2])
    println(cars[3])
    println(cars)
    cars[0]="Hello"
    println(cars[0])
    val size=cars.size
    println(size)*/
    if ("bmw" in cars || "BMW" in cars){
        println("Available")
    }else{
        println("doesn't available")
    }
}