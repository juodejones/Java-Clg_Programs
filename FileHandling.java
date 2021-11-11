import java.io.*;
import java.util.*;

public class FileHandling {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        boolean run = true;
        while (run) {
            System.out.println("\t1.Get File Details" +
                    "\n\t2.Write into a File" +
                    "\n\t3.Exit\nEnter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    getFileDetails();
                    break;
                case 2:
                    writeToFile();
                    break;
                case 3:
                    run = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }

    }

    public static void getFileDetails() {
        System.out.println("Enter File Name or Path : ");
        File file = new File(scanner.nextLine());

        if (file.exists()) {
            System.out.println("File name : " + file.getName());
            System.out.println("File exists : " + file.exists());
            System.out.println("Readable : " + file.canRead());
            System.out.println("Writable : " + file.canWrite());
            System.out.println("File Type : " + file.getName().substring(file.getName().indexOf(".")+1));
            System.out.println("Size of the File : " + file.length() + " bytes");
        } else {
            System.out.println("File not found!");
        }
    }

    public static boolean writeToFile() {

        System.out.println("Enter your file name : ");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(scanner.nextLine()))){
            System.out.println("Enter the string : ");
            bw.write(scanner.nextLine());
            return true;
        } catch (IOException e) {
            System.out.println("IO Error occured : " + e.getMessage());
        }
        return false;
    }
}
