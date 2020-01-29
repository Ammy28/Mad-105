fun main(){
    println("Enter a number from 1 to 10")
    val num = readLine()!!.toInt()

    when(num) {
        1 -> println("uno")
        2 -> println("zwei")
        3 -> println("Trois")
        4-> println("Shi")
        5 -> println("quinque")
        6 -> println("שש")
        7 -> println("syv")
        8 -> println("Ocht")
        9 -> println("เก้ า")
        10-> println("dek")
        else->println("Error not a valid number")
    }
}