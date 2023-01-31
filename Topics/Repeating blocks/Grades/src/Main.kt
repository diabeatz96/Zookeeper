fun main() {
    val amount = readln().toInt();
    var A : Int = 0;
    var B : Int = 0;
    var C : Int = 0;
    var D: Int = 0;

    repeat(amount) {
        val values = readln().toInt()
        if(values == 2) {
            D++
        } else if(values == 3) {
            C++;
        } else if (values == 4) {
            B++;
        } else if (values ==  5) {
            A++;
        }
    }
    print("$D $C $B $A")
}