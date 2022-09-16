package com.spartaglobal;

import java.util.Scanner;

public class chooseSort {

    public static int chosenSort() {

        int choice=0;
        boolean run=true;

        while (run) {
            System.out.println("This is a Sorting Program");
            System.out.println("Please Choose the Sorting Algorithm you would like to use");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Merge Sort");
            System.out.println("3. Binary Sort");
            System.out.println("4. All of the above and compare them.");
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                choice = input.nextInt();

                if ((choice >= 1) && (choice <= 4)) {
                    run = false;
                }

                else
                    System.out.println("You have entered an incorrect option, Please Try again");
            }
        }
        return choice-1;
    }

}
