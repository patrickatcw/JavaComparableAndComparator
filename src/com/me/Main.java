package com.me;

//initial code from collectionslistmethods, with a little clean up

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater("Severance Hall", 8, 12);

        //reserve a seat
        if (theater.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat is already reserved");
        }

        if (theater.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat is already reserved");
        }

        if (theater.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat is already reserved");
        }

    }

    //method that prints out the list
    public static void printList(List<Theater.Seat> list) {
        for (Theater.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());

        }
        System.out.println();
        System.out.println("-----------------------------");

    }

}

/*
initial code test print before steps for this program
Seat D12 reserved
Please pay for D12
Seat is already reserved
There is no seat B13
Seat is already reserved
 */

