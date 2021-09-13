package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int attempts = 0;
        Random random = new Random();
        int computerNumber = random.nextInt(100);
        System.out.println("Enter the number");
        int userNumber = input.nextInt();
        while(attempts < 20)
            if(userNumber == computerNumber){
                System.out.println("Correct");
                break;
            }
            else{
                System.out.println("wrong");
                attempts++;
                System.out.println((attempts + " attempts left"));
            }
        System.out.println(computerNumber + " was the answer");
    }
}
