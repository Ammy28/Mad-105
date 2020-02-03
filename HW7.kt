fun customer(phone:String, name:String){
    println("Your name is $name and the phone number is $phone")}
fun customer(bName:String, phone:String, name:String){
    println("Your Business is $bName, you are $name, and your phone number is $phone")}
fun main(){
do{
    var fail = 0
    println("Are you a business or residential customer")
    var type = readLine().toString()
    if (type == "residential"){
        println("Enter your name")
        var name = readLine().toString()
        println("Enter your phone")
        var phone = readLine().toString()
        customer(phone ,name)}
    else if(type == "business"){
        println("Enter your name")
    var name = readLine().toString()
        println("Enter your phone")
    var phone = readLine().toString()
        println("Enter your business name")
    var bName = readLine().toString()
    customer(bName, phone ,name)}
else{
    println("That isn’t a customer we recognize")
    fail = 1}
}while(fail == 1)}
