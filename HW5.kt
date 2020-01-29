fun main(){
    do{

        println("Choose an option from 1 - 6")
                println("1 - milk")
                println("2 - coffee")
                println("3 - soda")
                println("4 - beer")
                println("5 - whisky")
                println("6 - exit")
                var entry = readLine()!!.toInt()
        when(entry){
        1->println("milk")
        2->println("coffee")
        3->println("soda")
        4->println("beer")
        5->println("whisky")
        6->println("Goodbye!")
        else->{println("Error try again")
            entry = -1}
        }

    }while(entry  == -1)
}

