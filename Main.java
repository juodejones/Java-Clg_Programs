//
//Created By Juode on 02/09/2021
//
//

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Converter.*;
import AbstractClasses.*;

public class Main {

    private static DataInputStream inputStream = new DataInputStream(System.in);

    public static void main(String[] args) throws IOException{
        converterMain();
    }

    public static void abstractClassMain() throws IOException{
		boolean run = true;
		int a, b;

		while (run) {
			System.out.println("\n-----Area Calculator-----\n\t1 --> Rectangle\n\t2 --> Triangle\n\t3 --> Circle\n\t4 --> Exit\nEnter your choice : ");
			int choice = Integer.parseInt(inputStream.readLine());

			switch(choice) {
				case 1:
					System.out.println("Enter the length and breadth : ");
					a = Integer.parseInt(inputStream.readLine());
					b = Integer.parseInt(inputStream.readLine());
					Rectangle rectangle = new Rectangle(a, b);
					rectangle.printArea();
					break;
				case 2:
					System.out.println("Enter the height and breadth : ");
					a = Integer.parseInt(inputStream.readLine());
					b = Integer.parseInt(inputStream.readLine());
					Triangle triangle = new Triangle(a, b);
					triangle.printArea();
					break;
				case 3:
					System.out.println("Enter the radius : ");
					a = Integer.parseInt(inputStream.readLine());
					Circle circle = new Circle(a);
					circle.printArea();
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("Invald Choice!");
			}
		}
	}

    public static void converterMain() {

        CurrencyConverter currencyConverter = new CurrencyConverter();
        DistanceConverter distanceConverter = new DistanceConverter();
        TimeConverter timeConverter = new TimeConverter();

        try {
            boolean exit = false;
            do {
                System.out.println("----------Converter Application----------"
                        + "\n\t1 --> Currency Converter"
                        + "\n\t2 --> Distance Converter"
                        + "\n\t3 --> Time Converter"
                        + "\n\t4 --> Exit"
                        + "\nEnter your choice : ");
                int choice = Integer.parseInt(inputStream.readLine());

                switch (choice) {
                    case 1:
                        currencyConverter.execute();
                        break;
                    case 2:
                        distanceConverter.execute();
                        break;
                    case 3:
                        timeConverter.execute();
                        break;
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid Choice!");

                }
            }while (!exit);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void ebBillMain() {
        EBBill bill = new EBBill();
        bill.getInput();
        bill.generateBill();
        bill.printBill();
    }
}
