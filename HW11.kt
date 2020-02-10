fun main() {
    var total = 0
    var a1 = ""
    println("What is Saber’s true name?")
     a1 = readLine().toString()
            if((a1.compareTo("Arturia Pendragon", true)==0 ) or (a1.compareTo("Arturia", true) == 0)){
                println("Correct")
                total++}
    else{
        println("Incorrect")}
    println("What is Caster’s true name?")
     a1 = readLine().toString()
            if(a1.compareTo("Medea", true) == 0){
                println("Correct")
                total++}
    else{
        println("Incorrect")}
    println("What is Berserker's true name?")
            a1 = readLine().toString()
        if(a1.compareTo("Heracles", true) == 0){
            println("Correct")
            total++}
                else{
            println("Incorrect")}
                println("What is Rider’s true name?")
     a1 = readLine().toString()
            if(a1.compareTo("Medusa", true) == 0){
                println("Correct")
                total++}
    else{
        println("Incorrect")}
    println("What is Archer’s true name?")
     a1 = readLine().toString()
            if((a1.compareTo("Shirou Emiya", true) == 0) or (a1.compareTo("Shirou", true) == 0)){
                println("Correct")
                total++}
    else{
        println("Incorrect")}

    println("You got $total correct.")

}