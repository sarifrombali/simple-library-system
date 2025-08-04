package com.mycompany.simplelibrarysystem;


public class Simplelibrarysystem {
    
//    class Book {
//        public String title;
//        public String author;
//        public String publicationDate;
//        public int copiesAvailable;
//    }

    public static void main(String[] args) {
        double income = 30000, tax;
        if(income <= 15000) {
            tax = 0;
        }
        else if (income <= 25000) {
            tax = 0.05 * (income - 15000);
        }
        else {
            tax = 0.05 * (income - (25000 - 15000));
            tax += 0.10 * (income - 25000);
        }
        
        System.out.println("This year's tax: $" + tax);
    }
}
