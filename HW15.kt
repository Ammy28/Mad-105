fun main() {
    var done = 0
    var entry = 0
    do{println("choose 1 for a commercial customer, 2 for a  residential customer, or 3 to end")
     try {
         entry = readLine()!!.toInt()
     }catch (e:Exception){
         println("The character you entered was not valid, please try again.")
     }
    if (entry == 1){
        println("Enter the property name, true if you have multiple properties or false otherwise, the customers name, the customers phone number, the customers address, and the square footage of the property ")
        try{var customer1 = Commercial(readLine().toString(), readLine()!!.toBoolean(),
            readLine().toString(),readLine().toString(),readLine().toString(), readLine()!!.toDouble())
        customer1.weeklyCharge()}
        catch(e:Exception){
            println("One of the entries was not valid please try again.")
        }
    }
    else if (entry == 2){
            println("Enter true if you the customer is a senior or false otherwise, the customers name, the customers phone number, the customers address, and the square footage of the property ")
            try{var customer2 = Residential(readLine()!!.toBoolean(),
                readLine().toString(),readLine().toString(),readLine().toString(), readLine()!!.toDouble())
        customer2.weeklyCharge()}catch (e:java.lang.Exception){
                println("One of the entries was not valid please try again.")
            }
    }
    else if(entry == 3){
        println("Thank you and goodbye")
        done = 9}
        else{println{"The number you entered is not a valid entry, please try again."}}
    }while (done == 0)
}