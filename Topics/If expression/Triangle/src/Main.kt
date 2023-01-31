import kotlin.math.pow

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    if( (a + b) > c && (c + b) > a && (c + a) > b) {
        println("YES")
    } else {
        println("NO")
    }

}