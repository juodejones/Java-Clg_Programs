import java.io.DataInputStream;
import java.io.IOException;

public class EBBill {
    private int consumerID, initialUnit, finalUnit, unitConsumed, flag;
    private double amount;
    private String consumerName;
    private DataInputStream scanner = new DataInputStream(System.in);

    public void getInput() {
        try {
            System.out.println("Enter consumer Id : ");
            consumerID = Integer.parseInt(scanner.readLine());
            System.out.println("Enter consumer Name : ");
            consumerName = scanner.readLine();
            System.out.println("Enter last month reading : ");
            initialUnit = Integer.parseInt(scanner.readLine());
            System.out.println("Enter current reading : ");
            finalUnit = Integer.parseInt(scanner.readLine());
            System.out.println("1.Domestic / 2.Commercial");
            flag = Integer.parseInt(scanner.readLine());
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void generateBill() {

        unitConsumed = finalUnit - initialUnit;

        if (flag == 1){
            if (unitConsumed <= 100) {
                amount = unitConsumed * 1;
            } else if (unitConsumed > 100 && unitConsumed <= 200) {
                amount = 100 + ((unitConsumed-100) * 2.50);
            } else if (unitConsumed > 200 && unitConsumed <= 500) {
                amount = 100 + 250 + ((unitConsumed-200) * 4);
            } else {
                amount = 100 + 250 + 1200 + unitConsumed * 6;
            }
        } else if (flag == 2) {
            if (unitConsumed <= 100) {
                amount = unitConsumed * 2;
            } else if (unitConsumed > 100 && unitConsumed <= 200) {
                amount = 100 + ((unitConsumed-100) * 4.50);
            } else if (unitConsumed > 200 && unitConsumed <= 500) {
                amount = 100 + 250 + ((unitConsumed-200) * 6);
            } else {
                amount = 100 + 250 + 1200 + unitConsumed * 7;
            }
        }
    }

    public void printBill() {
        System.out.println("Consumer ID --> " + consumerID);
        System.out.println("Consumer Name --> " + consumerName);
        System.out.println("Consumed Electricity --> " + unitConsumed + " units");
        System.out.println("Bill amount --> " + amount);
    }
}
