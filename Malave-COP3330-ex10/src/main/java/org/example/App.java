package org.example;
import java.util.Scanner;
import java.util.Date;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        final double tax = 0.055;

        System.out.println( "Enter the price of item 1: " );
        String item1= sc.nextLine();

        System.out.println( "Enter the quantity of item 1: " );
        String quantiti1= sc.nextLine();

        System.out.println( "Enter the price of item 2:  " );
        String item2= sc.nextLine();

        System.out.println( "Enter the quantity of item 2:  " );
        String quantity2= sc.nextLine();

        System.out.println( "Enter the price of item 3:  " );
        String item3= sc.nextLine();

        System.out.println( "Enter the quantity of item 3:  " );
        String quantity3= sc.nextLine();

        double quant1 =Integer.parseInt(quantiti1);
        double quant2 =Integer.parseInt(quantity2);
        double quant3 =Integer.parseInt(quantity3);
        double item_1 =Integer.parseInt(item1);
        double item_2 =Integer.parseInt(item2);
        double item_3 =Integer.parseInt(item3);


        double total1 = (quant1 * item_1);
        double total2 = (quant2 * item_2);
        double total3 = (quant3 * item_3);

        double subTotal= (double) Math. round(total1 + total2 + total3);
        double taxTotal = (subTotal * tax);
        double total = (subTotal + taxTotal);
        System.out.println( "Subtotal: $" + subTotal + "\n" +
                            "Tax: $" + taxTotal + "\n" +
                            "Total: $" + total);
    }
}

