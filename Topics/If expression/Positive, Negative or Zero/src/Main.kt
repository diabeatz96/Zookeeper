fun main() {
    val integer : Int = readln().toInt();

    if(integer < 0) {
        println("negative")
    } else if (integer > 0) {
        println("positive")
    } else {
        println("zero")
    }
}