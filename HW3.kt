fun main(){
    println("Enter a temperature between 92.0 and 104.0")
    var temp = readLine()!!.toDouble()

    if(temp < 97.5)
        println("$temp degrees is low")
    else if (temp > 97.5 && temp < 99.5)
        print("$temp degrees is normal")
    else
        print("$temp degrees is high")

}