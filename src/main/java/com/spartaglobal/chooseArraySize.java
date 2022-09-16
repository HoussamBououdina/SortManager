package com.spartaglobal;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class chooseArraySize {
    public static Logger logger= LogManager.getLogger(Starter.class);

    public static int arraySize() {
        int size = 0;
        boolean run = true;
        System.out.println("Please enter the size of the array you want to be randomly generated");
        while (run) {
            Scanner readSize = new Scanner(System.in);
            if (readSize.hasNextInt()) {
                size = readSize.nextInt();

                if (size > 0)
                    run = false;
                else {
                    System.out.println("please enter a size larger than 0");
                    logger.log(Level.WARN, "Tried to entered " + size + " as an array size");


                }

            } else {
                System.out.println("You have entered an incorrect input. Please enter the size of the array you want to be generated as digits");
                logger.log(Level.ERROR,"Tried to enter a non integer as an array size");
            }
        }

        return size;
    }
}
