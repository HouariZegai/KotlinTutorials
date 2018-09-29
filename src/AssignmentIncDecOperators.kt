fun main(args: Array<String>) {
    var n : Int = 10

    // Assignment Operators
    n += 30 // n = n + 30
    println(n)
    n -= 5
    println(n)
    n *= 2 // n = n * 2
    println(n)
    n /= 2
    println(n)
    n %= 10 // n = n % 10
    println(n)

    // Increment & Decrement Operators
    var num = 15
    num++
    println(num)
    num--
    println("Num: $num")

    println("-----------")
    println(num--)
    println(num)
}