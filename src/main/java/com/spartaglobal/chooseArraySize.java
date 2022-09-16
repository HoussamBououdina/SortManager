package com.spartaglobal;

import java.util.Scanner;

public class chooseArraySize {

    public static int arraySize() {
        int size = 0;
        boolean run = true;
        System.out.println("Please enter the size of the array you want to be randomly generated");
        while (run) {
            Scanner readSize = new Scanner(System.in);
            if (readSize.hasNextInt()) {
                size = readSize.nextInt();
                run = false;
            } else
                System.out.println("You have entered an incorrect input. Please enter the size of the array you want to be generated as digits");
        }

        return size;
    }
}
