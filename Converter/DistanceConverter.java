package Converter;

import java.util.Scanner;

public class DistanceConverter {

    private double km,m,miles;
    private Scanner sc = new Scanner(System.in);

    public void execute() {

        System.out.println(
                   "\t1 -->  Meter to Kilometer "
                +"\n\t2 -->  Kilometer to Meter "
                +"\n\t3 -->  Miles to Kilometer "
                +"\n\t4 -->  Kilometer to Miles"
                +"\nEnter your choice : ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                mToKm();
                break;
            case 2:
                kmToM();
                break;
            case 3:
                milesToKm();
                break;
            case 4:
                kmToMiles();
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }

    public void kmToM() {
        System.out.print("Enter in km :");
        km = sc.nextDouble();
        m = (km*1000);
        System.out.println(km+"km" +" equal to "+ m +"m");
    }

    public void mToKm() {
        System.out.print("Enter in meter : ");
        m = sc.nextDouble();
        km = (m/1000);
        System.out.println(m+"m" +" equal to "+ km +"km");
    }

    public void milesToKm() {
        System.out.print("Enter in miles : ");
        miles = sc.nextDouble();
        km = (miles*1.60934);
        System.out.println(miles+"miles" +" equal to "+ km +"km");
    }

    public void kmToMiles() {
        System.out.print("Enter in km : ");
        km = sc.nextDouble();
        miles = (km*0.621371);
        System.out.println(km+"km" +" equal to "+ miles +"miles");
    }
}
