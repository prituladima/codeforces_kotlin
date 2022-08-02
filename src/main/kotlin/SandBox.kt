import java.io.PrintWriter
import java.lang.Integer.parseInt
import java.util.*

fun main() {
    println("Hello World!")
    val r = Rectangle(0.0, 1.0)
    r.height = 2.2000
    println(r)

    var a = 1
    // simple name in template:
    val s1 = "a is $a"

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    println(describe(Long.MAX_VALUE))

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }


    val x = parseInt("2")
    val y = parseInt("2")

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    } else {
        println("is not a number")
    }

    var cust = Customer("Dima", "dima@gmail.com")
    println(cust)
    println(cust)
    println(cust)
    println(cust.component1())
    println(cust.component2())
//    println(cust.component3())

    println("------------")
    val numbers = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
//    var filteredNumbers = numbers.filter( { (key, value) -> key.endsWith("1") && value > 10 })
    var filteredNumbers = numbers.filter { (key, value) -> key.endsWith("1") && value > 10 }
    println(filteredNumbers)
//    val me = Map.Entry
//    filteredNumbers = numbers.filter( keyValue -> key.endsWith("1") && value > 10 )
    println(numbers)
    println("------------")

    val persons = listOf(Person("Jack", 35), Person("David", 30),
        Person("Jack", 25))
    println(persons.sortedWith(compareBy(Person::name, Person::age)))
}

data class Person(
    val name: String,
    val age: Int
)

private fun upperBound(inclusiveLeft: Int, exclusiveRight: Int, predicate: (Int) -> Boolean): Int {
    var inclusiveLeft = inclusiveLeft
    var exclusiveRight = exclusiveRight
    while (exclusiveRight - inclusiveLeft > 1) {
        val middle = inclusiveLeft + (exclusiveRight - inclusiveLeft) / 2
        if (predicate(middle)) {
            inclusiveLeft = middle
        } else {
            exclusiveRight = middle
        }
    }
    return inclusiveLeft
}


data class Customer(val name: String, val email: String)

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
    override fun toString(): String {
        return perimeter.toString()
    }
}

/* I/O begin */

var st = StringTokenizer("")
val br = System.`in`.bufferedReader()
val pw = PrintWriter(System.out, false)

fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextLine() = br.readLine()!!
fun nextDouble() = next().toDouble()
fun nextStrArr(n: Int) = Array<String>(n) { next() }
fun nextIntArr(n: Int, dec: Int = 0) = IntArray(n) { nextInt() - dec }
fun nextLongArr(n: Int, dec: Long = 0L) = LongArray(n) { nextLong() - dec }

fun next(): String {
    while (!st.hasMoreTokens()) st = StringTokenizer(br.readLine()!!)
    return st.nextToken()
}

/* I/O end */