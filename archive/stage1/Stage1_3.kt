import java.util.*
//https://codeforces.com/contest/479/problem/C
fun main() {
    val n = readln().toInt()

    val arrangements = arrayOfNulls<Arrangement>(n)
    for (i in 0 until n) {
        val (a, b) = readInts()
        arrangements[i] = Arrangement(a, b, i)
    }

    val recordToListOfDays: MutableMap<Int, MutableList<Int>> = TreeMap()
    for (ar in arrangements) {
        if (!recordToListOfDays.containsKey(ar!!.record)) {
            recordToListOfDays[ar.record] = ArrayList()
        }
        recordToListOfDays[ar.record]!!.add(ar.earlyDate)
    }
    var lastDay = 0
    for (req in recordToListOfDays.keys) {
        recordToListOfDays[req]!!.sort()
        for (day in recordToListOfDays[req]!!) {
            if (lastDay <= day) {
                lastDay = day
            } else {
                lastDay = req
                break
            }
        }
    }
    println(lastDay)
}

data class Arrangement(val record: Int, val earlyDate: Int, val id: Int)

private fun readInt() = readln().toInt() // single int
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints