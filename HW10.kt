import java.text.DecimalFormat
fun main(){
    var amount = 0.00
    var newItem = 0.00
    do {
        println("Enter the price of the item. Enter a 0 when you are done")
        newItem = readLine()!!.toDouble()
        amount += newItem
    }while(newItem != 0.0)
    val twoDigits = DecimalFormat("$####.00")
    var total = twoDigits.format(amount)
    var tax = amount *0.025
    var taxTotal = twoDigits.format(tax)
    println("Total is $total and the tax is $taxTotal")
    println("Total w/ tax is ${twoDigits.format(amount + tax)} with a tip of ${twoDigits.format(amount * .175)}")

}