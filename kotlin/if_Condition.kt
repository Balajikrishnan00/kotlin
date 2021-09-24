/*
fun main() {
    if (10 != 10) {
        println("condition true")
    }else{
        println("Condition false")
    }
}
*/
fun main() {
    val a=10
    val b=20
    val c=30
    println("a:$a b:$b c:$c")
    if (a>b &&a>c){
        println("$a is grater of $b and $c")
    }else if(b>a && b>c){
        println("$b is grater of $a and $c")
    }else{
        println("$c is grater of $a and $b")
    }

}
