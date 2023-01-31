fun main() {
   val numbers = mutableListOf<Int>();
    val amount = readln().toInt();

    repeat(amount) {
        val num = readln().toInt();
        if(num > 0) {
            numbers.add(num);
        }
    }

    println(numbers.size)
}