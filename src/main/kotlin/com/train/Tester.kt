package com.train

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var totalt = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundt = scanner.nextInt()
    val ticket = Ticket(totalt,roundt)
    ticket.print()
}

class Ticket(var totalt: Int, var roundt: Int){
    var total : Int = (roundt * 2000 * 0.9 + (totalt - roundt) * 1000).toInt()
    fun print(){
        println("Total tickets: "+ totalt + "\n" + "Round-trip: "+
                roundt + "\n" + "Total: " + total)
}
}