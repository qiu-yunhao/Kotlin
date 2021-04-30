fun foo (int : Int){
    println(int)
}

fun foo1 (int: Int) = {
    println(int)
}

fun foo2(x : Int) = {
    y:Int -> x + y
}

val foo3 = {
    x:Int,y:Int -> x+y
}

 fun main(args : Array<String>){
     listOf(1,2,3).forEach{
         foo(it)
         foo1(it+3)()
         println(foo2(it)(6))
         val d = foo3(1,2)
         println(d)
     }
 }