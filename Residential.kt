class Residential (var seinor:Boolean,
                   customerName:String,
                   customerPhone:String,
                   customerAddress: String,
                   squareFootage:Double):Customer(customerName,
    customerPhone,
    customerAddress,
    squareFootage) {
    val resRate = 6.0/1000
    fun weeklyCharge(){
        if(!seinor){
             println("The weekly charge for the customer $customerName is ${(resRate * squareFootage)} when the square footage is $squareFootage")}
        else{ println("The weekly charge for the customer $customerName, with the phone number $customerPhone, and address $customerAddress and that them being a senior is $seinor is ${(resRate * squareFootage) -((resRate * squareFootage)*.15)} when the square footage is $squareFootage")}
    }
}