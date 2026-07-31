package interfaceEx;


import java.util.Scanner;
interface PaymentMethod {

    void pay(double amount);

    void refund(double amount);
}
class CreditCard implements PaymentMethod {

    @Override
    public void pay(double amount) {

        System.out.println("₹" + amount + " paid using Credit Card.");
    }

    @Override
    public void refund(double amount) {

        System.out.println("₹" + amount + " refunded to Credit Card.");
    }
}
class UPI implements PaymentMethod {

    @Override
    public void pay(double amount) {

        System.out.println("₹" + amount + " paid using UPI.");
    }

    @Override
    public void refund(double amount) {

        System.out.println("₹" + amount + " refunded to UPI account.");
    }
}
class NetBanking implements PaymentMethod {

    @Override
    public void pay(double amount) {

        System.out.println("₹" + amount + " paid using Net Banking.");
    }

    @Override
    public void refund(double amount) {

        System.out.println("₹" + amount + " refunded through Net Banking.");
    }
}

public class OnlineShopping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Payment Amount: ");
        double amount = sc.nextDouble();

        PaymentMethod[] payments = {

                new CreditCard(),
                new UPI(),
                new NetBanking()
        };

        for (PaymentMethod payment : payments) {

            System.out.println("\n----------------------------");

            payment.pay(amount);

            payment.refund(amount);
        }

        sc.close();
    }
}