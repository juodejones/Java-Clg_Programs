import java.io.*;
import java.util.*;

public class StringArrayList {

    private static DataInputStream inputStream = new DataInputStream(System.in);
    private ArrayList<String> arrayList = new ArrayList<>();
    private static int n;

    public static void main(String[] args) throws IOException {
        StringArrayList object = new StringArrayList();

        System.out.println("-----String operations using ArrayList-----");

        while (true) {
            System.out.println( "\n\t1.Create List" +
                                "\n\t2.Display" +
                                "\n\t3.Append" +
                                "\n\t4.Insert" +
                                "\n\t5.Search" +
                                "\n\t6.Find Strings" +
                                "\n\t7.Exit");
            int choice = Integer.parseInt(inputStream.readLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the number of elements : ");
                    n = Integer.parseInt(inputStream.readLine());
                    for (int i = 0; i < n; ++i) {
                        System.out.println("Enter a String : ");
                        object.arrayList.add(inputStream.readLine());
                    }
                    break;
                case 2:
                    object.display();
                    break;
                case 3:
                    System.out.println("Enter a String to append : ");
                    System.out.println("Appended = " + object.append(inputStream.readLine()));
                    break;
                case 4:
                    System.out.println("Enter the index of the element : ");
                    int index = Integer.parseInt(inputStream.readLine());
                    System.out.println("Enter the element to insert : ");
                    object.insert(index, inputStream.readLine());
                    break;
                case 5:
                    System.out.println("Enter an string to search : ");
                    System.out.println(object.search(inputStream.readLine()));
                    break;
                case 6:
                    System.out.println("Enter a character : ");
                    object.initial(inputStream.readLine());
                    break;
                case 7:
                    System.out.println("Exiting........");
                    return;
                default:
                    System.out.println("---Enter a valid choice!---");
            }
        }

    }

    public void display() {
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator + " ");
        }
    }

    public String append(String input) {
        if (!arrayList.contains(input)) {
            arrayList.add(input);
        }
        return input;
    }

    public String insert(int index, String input) {
        if(!arrayList.contains(input)){
            arrayList.add(index-1, input);
        }
        return input;
    }

    public String search(String input) {
        for (int i = 0; i < n; i++) {
            if (arrayList.get(i).equalsIgnoreCase(input))
                return "Element found!";
        }
        return "Element Not found!";
    }

    public void initial(String ch) {
        for (int i = 0; i < n; i++) {
            if (arrayList.get(i).startsWith(ch))
                System.out.println(arrayList.get(i));
        }
    }
}

//import java.io.*;
//import java.util.*;

//public class StringArrayList {

    //private static DataInputStream inputStream = new DataInputStream(System.in);
    //private ArrayList<String> arrayList = new ArrayList<>();
    //private static int n;

    //public static void main(String[] args) throws IOException {
        //StringArrayList object = new StringArrayList();

        //boolean carryOn = true;
        //System.out.println("-----String operations using ArrayList-----");

        //while (carryOn) {
            //System.out.println( "\n\t1.Create List" +
                                //"\n\t2.Display" +
                                //"\n\t3.Append" +
                                //"\n\t4.Insert" +
                                //"\n\t5.Search" +
                                //"\n\t6.Find Strings" +
                                //"\n\t7.Exit");
            //int choice = Integer.parseInt(inputStream.readLine());
            //switch (choice) {
                //case 1:
                    //System.out.println("Enter the number of elements : ");
                    //n = Integer.parseInt(inputStream.readLine());
                    //for (int i = 0; i < n; ++i) {
                        //System.out.println("Enter a String : ");
                        //object.arrayList.add(inputStream.readLine());
                    //}
                    //break;
                //case 2:
                    //object.display();
                    //break;
                //case 3:
                    //System.out.println("Enter a String to append : ");
                    //System.out.println("Appended = " + object.append(inputStream.readLine()));
                    //break;
                //case 4:
                    //System.out.println("Enter the index of the element : ");
                    //int index = Integer.parseInt(inputStream.readLine());
                    //System.out.println("Enter the element to insert : ");
                    //object.insert(index, inputStream.readLine());
                    //break;
                //case 5:
                    //System.out.println("Enter an string to search : ");
                    //System.out.println(object.search(inputStream.readLine()));
                    //break;
                //case 6:
                    //System.out.println("Enter a character : ");
                    //object.initial(inputStream.readLine());
                    //break;
                //case 7:
                    //carryOn = false;
                    //System.out.println("Exiting........");
                    //break;
                //default:
                    //System.out.println("---Enter a valid choice!---");
            //}
        //}

    //}

    //public void display() {
        //Iterator iterator = arrayList.iterator();
        //while (iterator.hasNext()) {
            //System.out.println(iterator + " ");
        //}
    //}

    //public boolean append(String input) {

        //if (!arrayList.contains(input)) {
            //arrayList.add(input);
            //return true;
        //}
        //return false;
    //}

    //public boolean insert(int index, String input) {

        //if(!arrayList.contains(input)){
            //arrayList.add(index-1, input);
            //return true;
        //}
        //return false;
    //}

    //public String search(String input) {

        //for (int i = 0; i < n; i++) {
            //if (arrayList.get(i).equalsIgnoreCase(input))
                //return "Element found!";
        //}
        //return "Element Not found!";
    //}

    //public void initial(String ch) {

        //System.out.println("Strings in the list starting with \'" + ch + "\' : ");
        //for (int i = 0; i < n; i++) {
            //if (arrayList.get(i).startsWith(ch))
                //System.out.println(arrayList.get(i));
        //}
    //}
//}
