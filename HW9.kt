fun main(){
    var hDog = arrayOf<String>("Hot dogs","Hot dog buns","Mustard","Ketchup","Pickles")
    var hDogSup = arrayOf<String>("40","40","20","20","20")
    var combined = arrayOf<Array<String>>(hDog,hDogSup)
    var re = 0
    do{
        var count = 0
        println("What item would you like to look at or change?")
        var item  = readLine().toString()
        for(i in 0..combined[0].size-1){
            if(combined[0][i] == item){
                println("You have ${combined[1][i]} ${combined[0][i]}")
                println("Would you like to add or subtract some? Enter y or n")
                var choose = readLine().toString()
                        if( choose == "y"){
                            println("Enter a positive number to or a negative number to subtract")

                    var change = readLine().toString()
                            if((combined[1][i].toInt() + change.toInt()) > 0 ){
                    combined[1][i] = (combined[1][i].toInt() + change.toInt()).toString()
                            println("You now have ${combined[1][i]} ${combined[0][i]}")}
                            else{
                                println("The number you enter made you have a negative inventory")
                            }
                }
            }else{
                count ++}}
        if (count == combined[0].size){
            println("That item does not appear to exist")}
        println("Would you like to enter another item? Enter y or n")
        var choose = readLine().toString()
                if (choose == "y"){
            re = 1
        }
        else{
            re = 0}
    }while(re==1)

}