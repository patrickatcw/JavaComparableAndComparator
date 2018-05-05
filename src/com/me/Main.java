package com.me;

//initial code from collectionslistmethods, with a little clean up

import java.util.ArrayList;
import java.util.Collections;
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

        //step 1 for program
        //testing the sort, first creating a new instance
        List<Theater.Seat> reverseSeats = new ArrayList<>(theater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);
        //run
        //then step 2 back to theater class

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

/*
results for step 1, testing the sort
Seat D12 reserved
Please pay for D12
Seat is already reserved
There is no seat B13
Seat is already reserved
 H12 $7.0 H11 $7.0 H10 $7.0 H09 $7.0 H08 $7.0 H07 $7.0 H06 $7.0 H05 $7.0 H04 $7.0 H03 $7.0 H02 $7.0 H01 $7.0 G12 $7.0 G11 $7.0 G10 $7.0 G09 $7.0 G08 $7.0 G07 $7.0 G06 $7.0 G05 $7.0 G04 $7.0 G03 $7.0 G02 $7.0 G01 $7.0 F12 $7.0 F11 $7.0 F10 $7.0 F09 $12.0 F08 $12.0 F07 $12.0 F06 $12.0 F05 $12.0 F04 $12.0 F03 $7.0 F02 $7.0 F01 $7.0 E12 $7.0 E11 $7.0 E10 $7.0 E09 $12.0 E08 $12.0 E07 $12.0 E06 $12.0 E05 $12.0 E04 $12.0 E03 $7.0 E02 $7.0 E01 $7.0 D12 $7.0 D11 $7.0 D10 $7.0 D09 $12.0 D08 $12.0 D07 $12.0 D06 $12.0 D05 $12.0 D04 $12.0 D03 $7.0 D02 $7.0 D01 $7.0 C12 $7.0 C11 $7.0 C10 $7.0 C09 $14.0 C08 $14.0 C07 $14.0 C06 $14.0 C05 $14.0 C04 $14.0 C03 $7.0 C02 $7.0 C01 $7.0 B12 $7.0 B11 $7.0 B10 $7.0 B09 $14.0 B08 $14.0 B07 $14.0 B06 $14.0 B05 $14.0 B04 $14.0 B03 $7.0 B02 $7.0 B01 $7.0 A12 $7.0 A11 $7.0 A10 $7.0 A09 $14.0 A08 $14.0 A07 $14.0 A06 $14.0 A05 $14.0 A04 $14.0 A03 $7.0 A02 $7.0 A01 $7.0
-----------------------------
 */

