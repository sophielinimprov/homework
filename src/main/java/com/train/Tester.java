package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalt = 0;
        int roundt = 0;
        do {System.out.println("Please enter number of tickets: ");
            totalt = scanner.nextInt();
            if(totalt==-1){
                System.out.println("End");break;}
            else { System.out.println("How many round-trip tickets: ");
                    roundt = scanner.nextInt();}
                    Ticket ticket = new Ticket(totalt, roundt);
                    ticket.print();
        }while(totalt!=-1);

    }
}
