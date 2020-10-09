package com.train

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var totalt = 0;
    var roundt = 0;
    while(totalt!=-1){
        print("Please enter number of tickets: ")
        totalt = scanner.nextInt()
        if(totalt==-1){
            println("End");break
        }
        else{
            print("How many round-trip tickets: ")
            roundt = scanner.nextInt()
            val ticket = Ticket(totalt,roundt)
            ticket.print()
        }
    }


}

class Ticket(var totalt: Int, var roundt: Int){
    var total : Int = (roundt * 2000 * 0.9 + (totalt - roundt) * 1000).toInt()
    fun print(){
        println("Total tickets: "+ totalt + "\n" + "Round-trip: "+
                roundt + "\n" + "Total: " + total)
}
}