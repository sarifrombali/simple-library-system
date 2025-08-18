package com.mycompany.simplelibrarysystem;

import java.util.Scanner;

public class Simplelibrarysystem {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean isAvailable = true;
        String requestType;
        String isLate;
        int lateFee = 5;
        boolean processDone = false;
        
        System.out.print("Would you like to BORROW or RETURN a book? : ");
        requestType = sc.nextLine();
        
        while(!processDone) {
            switch(requestType) {
                case "BORROW":
                    if(isAvailable) {
                        System.out.println("Done! Remember to return it in 14 days!");
                    } else {
                        System.out.println("Sorry, currently it is not available.");
                    };
                    processDone = true;
                    break;

                case "RETURN":
                    System.out.println("Are you returning this book late? (Y/N): ");
                    isLate = sc.nextLine();
                    switch(isLate) {
                        case "Y":
                            System.out.println("You are late! A $" + lateFee + " fee is due.");
                            processDone = true;
                            break;
                        case "N":
                            System.out.println("Thank you for returning the book on time!");
                            processDone = true;
                            break;
                        default:
                            System.out.println("Error! Please type in Y for 'yes' or N for 'no'");
                    }
                    break;

                default:
                    System.out.print("Error! Please type in BORROW or RETURN: ");
                    requestType = sc.nextLine();
            }
        }

        sc.close();
        
    }
    
}
