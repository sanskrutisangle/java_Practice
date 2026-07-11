package decisionMakingStatements;

import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Are you a member? (true/false): ");
        boolean member = sc.nextBoolean();

        if (member) {

            System.out.print("Enter Purchase Amount: ");
            double amount = sc.nextDouble();
            double discount = 0;
            
            if(amount>=10000) {
            	discount = amount*30/100;
               }else if(amount>=5000) {
            	   discount=amount*15/100;
               }else if(amount>=2000) {
            	   discount=amount*10/100;
               }else {
            	   discount=amount*5/100;
               }
            double finalAmount=amount-discount;
            System.out.println("Original Amount : " + amount);
            System.out.println("Discount : " + discount);
            System.out.println("Final Amount : " + finalAmount);

        } else {
            System.out.println("No discount. Membership is required.");
        }

        sc.close();
    }
}