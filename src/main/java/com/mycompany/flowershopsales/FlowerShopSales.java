//CODE ATTRIBUTION:
//Title: Java Tutorial
//Author: w3schools
//Date:17 August 2026
//URL:https://www.w3schools.com/java/ 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flowershopsales;

/**
 *
 * @author emeris
 */

import java.util.Scanner;

public class FlowerShopSales {

    public static void main(String[] args) {

        // Scanner is used to get input from the user
        Scanner input = new Scanner(System.in);

        // Days of the week
        String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };

        // Types of bouquets
        String[] bouquets = {
            "Roses",
            "Tulips",
            "Lilies"
        };

        // Two-dimensional array
        // 7 rows for the days
        // 3 columns for the bouquet types
        int[][] sales = new int[7][3];

        // INPUT SALES DATA

        System.out.println("==========================================");
        System.out.println("        FLOWER SHOP SALES SYSTEM");
        System.out.println("==========================================");

        System.out.println("\nPlease enter the number of bouquets sold.");

        // Outer loop - goes through each day
        for (int i = 0; i < sales.length; i++) {

            System.out.println("\n" + days[i] + ":");

            // Inner loop - goes through each bouquet type
            for (int j = 0; j < sales[i].length; j++) {

                System.out.print("Enter " + bouquets[j] + " sales: ");

                sales[i][j] = input.nextInt();
            }
        }
        // DISPLAY REPORT

        System.out.println("\n\n==========================================");
        System.out.println("      FLOWER SHOP WEEKLY SALES REPORT");
        System.out.println("==========================================");

        // Print table headings
        System.out.printf("%-12s %-10s %-10s %-10s %-10s%n",
                "DAY",
                "ROSES",
                "TULIPS",
                "LILIES",
                "TOTAL");

        System.out.println("------------------------------------------------------------");

        // Variables to store bouquet totals
        int rosesTotal = 0;
        int tulipsTotal = 0;
        int liliesTotal = 0;

        // Variable for the overall weekly total
        int overallTotal = 0;

        // CALCULATE AND DISPLAY DAILY TOTALS

        // Loop through each day
        for (int i = 0; i < sales.length; i++) {

            // Total sales for the current day
            int dailyTotal = 0;

            // Loop through each bouquet type
            for (int j = 0; j < sales[i].length; j++) {

                // Add sale to daily total
                dailyTotal = dailyTotal + sales[i][j];

                // Add sale to bouquet total
                if (j == 0) {
                    rosesTotal = rosesTotal + sales[i][j];
                } 
                else if (j == 1) {
                    tulipsTotal = tulipsTotal + sales[i][j];
                } 
                else if (j == 2) {
                    liliesTotal = liliesTotal + sales[i][j];
                }
            }

            // Add daily total to weekly total
            overallTotal = overallTotal + dailyTotal;

            // Display the current day's information
            System.out.printf("%-12s %-10d %-10d %-10d %-10d%n",
                    days[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2],
                    dailyTotal);
        }

        System.out.println("------------------------------------------------------------");

        // DISPLAY TOTALS

        System.out.printf("%-12s %-10d %-10d %-10d %-10d%n",
                "TOTAL",
                rosesTotal,
                tulipsTotal,
                liliesTotal,
                overallTotal);

        System.out.println();

        System.out.println("Total sales for Roses: " + rosesTotal);
        System.out.println("Total sales for Tulips: " + tulipsTotal);
        System.out.println("Total sales for Lilies: " + liliesTotal);

        System.out.println();
        System.out.println("Overall total sales for the week: R " + overallTotal);
    
        input.close();
    }
}
