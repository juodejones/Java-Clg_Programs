package Converter;

import java.util.Currency;
import java.util.Scanner;

public class CurrencyConverter {

    public Scanner scanner = new Scanner(System.in);

    public void execute() {
        System.out.println("Press to perform the action: \n"+
                "\t1 --> USD to INR"
                +"\n\t2 --> INR to USD"
                +"\n\t3 --> EUR to INR"
                +"\n\t4 -->INR to EUR "
                +"\n\t5 --> YEN to INR"
                +"\n\t6 --> INR to YEN");
        int condition = scanner.nextInt();

        switch (condition){
            case 1:
                System.out.println("Enter amount to be converted : ");
                int amount = scanner.nextInt();
                dollarToInr(amount);
                break;
            case 2:
                System.out.println("Enter amount to be converted : ");
                amount = scanner.nextInt();
                inrToDollar(amount);
                break;
            case 3:
                System.out.println("Enter amount to be converted : ");
                amount = scanner.nextInt();
                euroToInr(amount);
                break;
            case 4:
                System.out.println("Enter amount to be converted : ");
                amount = scanner.nextInt();
                inrToEuro(amount);
                break;
            case 5:
                System.out.println("Enter amount to be converted : ");
                amount = scanner.nextInt();
                yenToInr(amount);
                break;
            case 6:
                System.out.println("Enter amount to be converted : ");
                amount = scanner.nextInt();
                inrToYen(amount);
                break;
            default:
                System.out.println("Invalid Choice!");
        }
        scanner.nextLine();
    }

    public void dollarToInr(double amount){
        double Inr = amount * 73.51;
        System.out.println(Currency.getInstance("USD").getSymbol() + amount + " --> "+Currency.getInstance("INR").getSymbol()+Inr);
    }
    public void euroToInr(double amount){
        double Inr = amount * 86.96;
        System.out.println(Currency.getInstance("EUR").getSymbol() + amount +" --> "+Currency.getInstance("INR").getSymbol()+Inr);
    }

    public void inrToDollar(double amount){
        double dollar = amount / 73.51;
        System.out.println(Currency.getInstance("INR").getSymbol() + amount + " --> "+ dollar + Currency.getInstance("USD").getSymbol());
    }

    public void inrToEuro(double amount){
        double euro = amount / 86.96;
        System.out.println(Currency.getInstance("INR").getSymbol() + amount + " --> " + euro + Currency.getInstance("EUR").getSymbol());
    }

    public void yenToInr(double amount) {
        double inr = amount*0.67;
        System.out.println(Currency.getInstance("JPY").getSymbol() + amount  + " --> " + Currency.getInstance("INR").getSymbol() + inr);
    }

    public void inrToYen(double amount) {
        double yen = amount/0.67;
        System.out.println(Currency.getInstance("INR").getSymbol() + amount  + " --> " + Currency.getInstance("JPY").getSymbol() + yen);
    }
}
