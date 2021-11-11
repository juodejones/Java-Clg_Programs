package Converter;

import java.util.Scanner;

public class TimeConverter {

    private int hours,seconds,minutes;
    private int input;
    private Scanner sc = new Scanner(System.in);

    public void execute() {

        System.out.println("\t1-->  Hours to Minutes"
                +"\n\t2-->  Hours to Seconds"
                +"\n\t3-->  Seconds to Hours"
                +"\n\t4-->  Minutes to Hours"
                +"\nEnter your choice : ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                hoursToMinutes();
                break;
            case 2:
                hoursToSeconds();
                break;
            case 3:
                secondsToHours();
                break;
            case 4:
                minutesToHours();
                break;
            default:
                System.out.println("Invalid Choice!");
        }

    }

    public void secondsToHours() {
        System.out.print("Enter the number of seconds : ");
        input = sc.nextInt();
        hours = input / 3600;
        minutes = (input % 3600) / 60;
        seconds = (input % 3600) % 60;
        System.out.println("Hours : " + hours);
        System.out.println("Minutes : " + minutes);
        System.out.println("Seconds : " + seconds);
    }

    public void minutesToHours() {
        System.out.print("Enter the number of minutes : ");
        minutes=sc.nextInt();
        hours=minutes/60;
        minutes=minutes%60;
        System.out.println("Hours : " + hours);
        System.out.println("Minutes : " + minutes);
    }

    public void hoursToMinutes() {
        System.out.println("Enter the no of hours : ");
        hours=sc.nextInt();
        minutes=(hours*60);
        System.out.println("Minutes : " + minutes);
    }

    public void hoursToSeconds() {
        System.out.println("Enter the no of hours : ");
        hours=sc.nextInt();
        seconds=(hours*3600);
        System.out.println("Minutes : " + seconds);
    }
}
