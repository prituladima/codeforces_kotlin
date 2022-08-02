//import java.io.*
//import java.text.MessageFormat
//import java.util.*
//
///**
// * Provide prove of correctness before implementation. Implementation can cost a lot of time.
// * Anti test that prove that it's wrong.
// *
// *
// * Do not confuse i j k g indexes, upTo and length. Do extra methods!!! Write more informative names to simulation
// *
// *
// * Will program ever exceed limit?
// * Try all approaches with prove of correctness if task is not obvious.
// * If you are given formula/rule: Try to play with it.
// * Analytic solution/Hardcoded solution/Constructive/Greedy/DP/Math/Brute force/Symmetric data
// * Number theory
// * Game theory (optimal play) that consider local and global strategy.
// * Start writing the hardest code first
// */
//class TemplateFast {
//    val ONLINE_JUDGE = java.lang.System.getProperty("ONLINE_JUDGE") != null
//    val ANTI_TEST_FINDER_MODE = false
//    val random = Random(42)
//    private fun solveOne(testCase: Int): Int {
//        val n = nextInt()
//        val a = nextIntArr(n)
//        val s = System.`in`!!.readStringAsCharArray()
//        val m = nextInt()
//        val b = IntArray(m)
//        val c = IntArray(m)
//        for (i in 0 until m) {
//            b[i] = nextInt()
//            c[i] = nextInt()
//        }
//        return 0
//    }
//
//    private fun solveOneNaive(testCase: Int): Int {
//        return 0
//    }
//
//    private fun solve() {
//        if (ANTI_TEST_FINDER_MODE) {
//            val t = 100000
//            for (testCase in 0 until t) {
//                val expected = solveOneNaive(testCase)
//                val actual = solveOne(testCase)
//                if (expected != actual) {
//                    throw AssertionRuntimeException(
//                        this.javaClass.simpleName,
//                        testCase,
//                        expected,
//                        actual
//                    )
//                }
//            }
//        } else {
//            val t = nextInt()
//            for (testCase in 0 until t) {
//                solveOne(testCase)
//            }
//        }
//    }
//
//    internal inner class AssertionRuntimeException(
//        testName: String?,
//        testCase: Int,
//        expected: Any,
//        actual: Any, vararg input: Any?
//    ) :
//        RuntimeException(
//            """Testcase: $testCase
// expected = $expected,
// actual = $actual,
// ${Arrays.deepToString(input)}"""
//        )
//
//    private fun assertThat(b: Boolean) {
//        if (!b) throw RuntimeException()
//    }
//
//    private fun assertThat(b: Boolean, s: String) {
//        if (!b) throw RuntimeException(s)
//    }
//
//    private fun assertThatInt(a: Long): Int {
//        assertThat(
//            Int.MIN_VALUE <= a && a <= Int.MAX_VALUE,
//            "Integer overflow long = [" + a + "]" + " int = [" + a.toInt() + "]"
//        )
//        return a.toInt()
//    }
//
//    fun _______debug(str: String?, vararg os: Any?) {
//        if (!ONLINE_JUDGE) {
//            System.out!!.println(MessageFormat.format(str, *os))
//            System.out.flush()
//        }
//    }
//
//    fun _______debug(o: Any) {
//        if (!ONLINE_JUDGE) {
//            _______debug("{0}", o.toString())
//        }
//    }
//
//    private fun nextInt(): Int {
//        return System.`in`!!.readInt()
//    }
//
//    private fun nextLong(): Long {
//        return System.`in`!!.readLong()
//    }
//
//    private fun nextString(): String {
//        return System.`in`!!.readString()
//    }
//
//    private fun nextIntArr(n: Int): IntArray {
//        return System.`in`!!.readIntArray(n)
//    }
//
//    private fun nextLongArr(n: Int): LongArray {
//        return System.`in`!!.readLongArray(n)
//    }
//
//    internal object System {
//        var `in`: FastInputStream? = null
//        var out: FastPrintStream? = null
//    }
//
//    private fun run() {
////        final long startTime = java.lang.System.currentTimeMillis();
//        val USE_IO = ONLINE_JUDGE
//        if (USE_IO) {
//            System.`in` = FastInputStream(java.lang.System.`in`)
//            System.out = FastPrintStream(java.lang.System.out)
//            solve()
//            System.out!!.flush()
//        } else {
//            val nameIn = "input.txt"
//            val nameOut = "output.txt"
//            try {
//                System.`in` = FastInputStream(FileInputStream(nameIn))
//                System.out = FastPrintStream(PrintStream(nameOut))
//                solve()
//                System.out!!.flush()
//            } catch (e: FileNotFoundException) {
//                e.printStackTrace()
//            }
//        }
//        //        final long endTime = java.lang.System.currentTimeMillis();
////        _______debug("Execution time: {0}", endTime - startTime);
//    }
//
//    class FastPrintStream {
//        private val buf = ByteArray(BUF_SIZE)
//        private val out: OutputStream
//        private var ptr = 0
//
//        private constructor() : this(java.lang.System.out) {}
//        constructor(os: OutputStream) {
//            out = os
//        }
//
//        constructor(path: String?) {
//            try {
//                out = FileOutputStream(path)
//            } catch (e: FileNotFoundException) {
//                throw RuntimeException("FastWriter")
//            }
//        }
//
//        fun print(b: Byte): FastPrintStream {
//            buf[ptr++] = b
//            if (ptr == BUF_SIZE) innerFlush()
//            return this
//        }
//
//        fun print(c: Char): FastPrintStream {
//            return print(c.code.toByte())
//        }
//
//        fun print(s: CharArray): FastPrintStream {
//            for (c in s) {
//                buf[ptr++] = c.code.toByte()
//                if (ptr == BUF_SIZE) innerFlush()
//            }
//            return this
//        }
//
//        fun print(s: String): FastPrintStream {
//            s.chars().forEach { c: Int ->
//                buf[ptr++] = c.toByte()
//                if (ptr == BUF_SIZE) innerFlush()
//            }
//            return this
//        }
//
//        //can be optimized
//        fun print0(s: CharArray): FastPrintStream {
//            if (ptr + s.size < BUF_SIZE) {
//                for (c in s) {
//                    buf[ptr++] = c.code.toByte()
//                }
//            } else {
//                for (c in s) {
//                    buf[ptr++] = c.code.toByte()
//                    if (ptr == BUF_SIZE) innerFlush()
//                }
//            }
//            return this
//        }
//
//        //can be optimized
//        fun print0(s: String): FastPrintStream {
//            if (ptr + s.length < BUF_SIZE) {
//                for (i in 0 until s.length) {
//                    buf[ptr++] = s[i].code.toByte()
//                }
//            } else {
//                for (i in 0 until s.length) {
//                    buf[ptr++] = s[i].code.toByte()
//                    if (ptr == BUF_SIZE) innerFlush()
//                }
//            }
//            return this
//        }
//
//        fun print(x: Int): FastPrintStream {
//            var x = x
//            if (x == Int.MIN_VALUE) {
//                return print(x.toLong())
//            }
//            if (ptr + 12 >= BUF_SIZE) innerFlush()
//            if (x < 0) {
//                print('-'.code.toByte())
//                x = -x
//            }
//            val d = countDigits(x)
//            for (i in ptr + d - 1 downTo ptr) {
//                buf[i] = ('0'.code + x % 10).toByte()
//                x /= 10
//            }
//            ptr += d
//            return this
//        }
//
//        fun print(x: Long): FastPrintStream {
//            var x = x
//            if (x == Long.MIN_VALUE) {
//                return print("" + x)
//            }
//            if (ptr + 21 >= BUF_SIZE) innerFlush()
//            if (x < 0) {
//                print('-'.code.toByte())
//                x = -x
//            }
//            val d = countDigits(x)
//            for (i in ptr + d - 1 downTo ptr) {
//                buf[i] = ('0'.code.toLong() + x % 10).toByte()
//                x /= 10
//            }
//            ptr += d
//            return this
//        }
//
//        fun print(x: Double, precision: Int): FastPrintStream {
//            var x = x
//            if (x < 0) {
//                print('-')
//                x = -x
//            }
//            x += Math.pow(10.0, -precision.toDouble()) / 2
//            print(x.toLong()).print(".")
//            x -= x.toLong().toDouble()
//            for (i in 0 until precision) {
//                x *= 10.0
//                print(('0'.code + x.toInt()).toChar())
//                x -= x.toInt().toDouble()
//            }
//            return this
//        }
//
//        fun println(c: Char): FastPrintStream {
//            return print(c).println()
//        }
//
//        fun println(x: Int): FastPrintStream {
//            return print(x).println()
//        }
//
//        fun println(x: Long): FastPrintStream {
//            return print(x).println()
//        }
//
//        fun println(x: String): FastPrintStream {
//            return print(x).println()
//        }
//
//        fun println(x: Any): FastPrintStream {
//            return print(x.toString()).println()
//        }
//
//        fun println(x: Double, precision: Int): FastPrintStream {
//            return print(x, precision).println()
//        }
//
//        fun println(): FastPrintStream {
//            return print('\n'.code.toByte())
//        }
//
//        fun printf(format: String?, vararg args: Any?): FastPrintStream {
//            return print(String.format(format!!, *args))
//        }
//
//        private fun innerFlush() {
//            ptr = try {
//                out.write(buf, 0, ptr)
//                0
//            } catch (e: IOException) {
//                throw RuntimeException("innerFlush")
//            }
//        }
//
//        fun flush() {
//            innerFlush()
//            try {
//                out.flush()
//            } catch (e: IOException) {
//                throw RuntimeException("flush")
//            }
//        }
//
//        companion object {
//            private const val BUF_SIZE = 8192
//            private fun countDigits(l: Int): Int {
//                if (l >= 1000000000) return 10
//                if (l >= 100000000) return 9
//                if (l >= 10000000) return 8
//                if (l >= 1000000) return 7
//                if (l >= 100000) return 6
//                if (l >= 10000) return 5
//                if (l >= 1000) return 4
//                if (l >= 100) return 3
//                return if (l >= 10) 2 else 1
//            }
//
//            private fun countDigits(l: Long): Int {
//                if (l >= 1000000000000000000L) return 19
//                if (l >= 100000000000000000L) return 18
//                if (l >= 10000000000000000L) return 17
//                if (l >= 1000000000000000L) return 16
//                if (l >= 100000000000000L) return 15
//                if (l >= 10000000000000L) return 14
//                if (l >= 1000000000000L) return 13
//                if (l >= 100000000000L) return 12
//                if (l >= 10000000000L) return 11
//                if (l >= 1000000000L) return 10
//                if (l >= 100000000L) return 9
//                if (l >= 10000000L) return 8
//                if (l >= 1000000L) return 7
//                if (l >= 100000L) return 6
//                if (l >= 10000L) return 5
//                if (l >= 1000L) return 4
//                if (l >= 100L) return 3
//                return if (l >= 10L) 2 else 1
//            }
//        }
//    }
//
//    class FastInputStream(private val stream: InputStream) {
//        private val finished = false
//        private val buf = ByteArray(1024)
//        private var curChar = 0
//        private var numChars = 0
//        var filter: SpaceCharFilter? = null
//
//        fun readDoubleArray(size: Int): DoubleArray {
//            val array = DoubleArray(size)
//            for (i in 0 until size) {
//                array[i] = readDouble()
//            }
//            return array
//        }
//
//        fun readStringArray(size: Int): Array<String?> {
//            val array = arrayOfNulls<String>(size)
//            for (i in 0 until size) {
//                array[i] = readString()
//            }
//            return array
//        }
//
//        fun readCharArray(size: Int): CharArray {
//            val array = CharArray(size)
//            for (i in 0 until size) {
//                array[i] = readCharacter()
//            }
//            return array
//        }
//
//        fun readText(): String {
//            val result = StringBuilder()
//            while (true) {
//                val character = read()
//                if (character == '\r'.code) {
//                    continue
//                }
//                if (character == -1) {
//                    break
//                }
//                result.append(character.toChar())
//            }
//            return result.toString()
//        }
//
//        fun readLongArray(size: Int): LongArray {
//            val array = LongArray(size)
//            for (i in 0 until size) {
//                array[i] = readLong()
//            }
//            return array
//        }
//
//        fun readIntArray(size: Int): IntArray {
//            val array = IntArray(size)
//            for (i in 0 until size) {
//                array[i] = readInt()
//            }
//            return array
//        }
//
//        fun read(): Int {
//            if (numChars == -1) {
//                throw InputMismatchException()
//            }
//            if (curChar >= numChars) {
//                curChar = 0
//                numChars = try {
//                    stream.read(buf)
//                } catch (e: IOException) {
//                    throw InputMismatchException()
//                }
//                if (numChars <= 0) {
//                    return -1
//                }
//            }
//            return buf[curChar++].toInt()
//        }
//
//        fun peek(): Int {
//            if (numChars == -1) {
//                return -1
//            }
//            if (curChar >= numChars) {
//                curChar = 0
//                numChars = try {
//                    stream.read(buf)
//                } catch (e: IOException) {
//                    return -1
//                }
//                if (numChars <= 0) {
//                    return -1
//                }
//            }
//            return buf[curChar].toInt()
//        }
//
//        fun peekNonWhitespace(): Int {
//            while (isWhitespace(peek())) {
//                read()
//            }
//            return peek()
//        }
//
//        fun readInt(): Int {
//            var c = read()
//            while (isSpaceChar(c)) {
//                c = read()
//            }
//            var sgn = 1
//            if (c == '-'.code) {
//                sgn = -1
//                c = read()
//            }
//            var res = 0
//            do {
//                if (c < '0'.code || c > '9'.code) {
//                    throw InputMismatchException()
//                }
//                res *= 10
//                res += c - '0'.code
//                c = read()
//            } while (!isSpaceChar(c))
//            return res * Int
//        }
//
//        fun readLong(): Long {
//            var c = read()
//            while (isSpaceChar(c)) {
//                c = read()
//            }
//            var sgn = 1
//            if (c == '-'.code) {
//                sgn = -1
//                c = read()
//            }
//            var res: Long = 0
//            do {
//                if (c < '0'.code || c > '9'.code) {
//                    throw InputMismatchException()
//                }
//                res *= 10
//                res += (c - '0'.code).toLong()
//                c = read()
//            } while (!isSpaceChar(c))
//            return res * sgn
//        }
//
//        fun readString(): String {
//            var c = read()
//            while (isSpaceChar(c)) {
//                c = read()
//            }
//            val res = StringBuilder()
//            do {
//                if (Character.isValidCodePoint(c)) {
//                    res.appendCodePoint(c)
//                }
//                c = read()
//            } while (!isSpaceChar(c))
//            return res.toString()
//        }
//
//        fun readStringAsCharArray(): CharArray {
//            var c = read()
//            while (isSpaceChar(c)) {
//                c = read()
//            }
//            val res = StringBuilder()
//            do {
//                if (Character.isValidCodePoint(c)) {
//                    res.appendCodePoint(c)
//                }
//                c = read()
//            } while (!isSpaceChar(c))
//            val resArr = CharArray(res.length)
//            res.getChars(0, res.length, resArr, 0)
//            return resArr
//        }
//
//        fun isSpaceChar(c: Int): Boolean {
//            return if (filter != null) {
//                filter!!.isSpaceChar(c)
//            } else isWhitespace(c)
//        }
//
//        private fun readLine0(): String {
//            val buf = StringBuilder()
//            var c = read()
//            while (c != '\n'.code && c != -1) {
//                if (c != '\r'.code) {
//                    buf.appendCodePoint(c)
//                }
//                c = read()
//            }
//            return buf.toString()
//        }
//
//        fun readLine(): String {
//            var s = readLine0()
//            while (s.trim { it <= ' ' }.length == 0) {
//                s = readLine0()
//            }
//            return s
//        }
//
//        fun readLine(ignoreEmptyLines: Boolean): String {
//            return if (ignoreEmptyLines) {
//                readLine()
//            } else {
//                readLine0()
//            }
//        }
//
//        fun readCharacter(): Char {
//            var c = read()
//            while (isSpaceChar(c)) {
//                c = read()
//            }
//            return c.toChar()
//        }
//
//        fun readDouble(): Double {
//            var c = read()
//            while (isSpaceChar(c)) {
//                c = read()
//            }
//            var sgn = 1
//            if (c == '-'.code) {
//                sgn = -1
//                c = read()
//            }
//            var res = 0.0
//            while (!isSpaceChar(c) && c != '.'.code) {
//                if (c == 'e'.code || c == 'E'.code) {
//                    return res * Math.pow(10.0, readInt().toDouble())
//                }
//                if (c < '0'.code || c > '9'.code) {
//                    throw InputMismatchException()
//                }
//                res *= 10.0
//                res += (c - '0'.code).toDouble()
//                c = read()
//            }
//            if (c == '.'.code) {
//                c = read()
//                var m = 1.0
//                while (!isSpaceChar(c)) {
//                    if (c == 'e'.code || c == 'E'.code) {
//                        return res * Math.pow(10.0, readInt().toDouble())
//                    }
//                    if (c < '0'.code || c > '9'.code) {
//                        throw InputMismatchException()
//                    }
//                    m /= 10.0
//                    res += (c - '0'.code) * m
//                    c = read()
//                }
//            }
//            return res * sgn
//        }
//
//        val isExhausted: Boolean
//            get() {
//                var value: Int
//                while (isSpaceChar(peek().also { value = it }) && value != -1) {
//                    read()
//                }
//                return value == -1
//            }
//
//        operator fun next(): String {
//            return readString()
//        }
//
//        interface SpaceCharFilter {
//            fun isSpaceChar(ch: Int): Boolean
//        }
//
//        companion object {
//            fun isWhitespace(c: Int): Boolean {
//                return c == ' '.code || c == '\n'.code || c == '\r'.code || c == '\t'.code || c == -1
//            }
//        }
//    }
//
//    companion object {
//        @JvmStatic
//        fun main(args: Array<String>) {
//            TemplateFast().run()
//        }
//    }
//}