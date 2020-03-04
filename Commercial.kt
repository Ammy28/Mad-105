class Commercial(var propertyName: String,
                 var multiProperty:Boolean,
                 customerName:String,
                 customerPhone:String,
                 customerAddress: String,
                 squareFootage:Double):Customer(customerName,
    customerPhone,
    customerAddress,
    squareFootage) {
    val comRate:Double = 5.0/1000
    fun weeklyCharge(){
        if(!multiProperty){
            println("The weekly charge for the customer $customerName, with the phone number $customerPhone, and address $customerAddress with the property ${propertyName} is${(comRate * squareFootage)} when the square footage is $squareFootage")}
        else{ println("The weekly charge for the customer $customerName, with the phone number $customerPhone, and address $customerAddress with the property ${propertyName} and that them having multiple properties is $multiProperty is ${(comRate * squareFootage) -((comRate * squareFootage)*.10)} when the square footage is $squareFootage")}
    }
}