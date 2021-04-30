package 第2章
fun main(args : Array<String>) {
    var sum = 0
    listOf(1, 2, 3).filter {item : Int -> ( item > 0 )  }.forEach {
        sum += it
    }
    println(sum)
    println(foo0(8)(7))
    println(foo1(1)(9))
    println(foo3(2)(3)(4))
}

fun foo0(x: Int) = {
    y:Int -> x+y
}

fun foo1(x: Int):(Int) -> Int{
    return {
        y: Int -> x + y
    }
}

fun foo3(x:Int) = {
    y:Int -> {
        z:Int -> x+y+z
}
}