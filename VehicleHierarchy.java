import java.io.DataInputStream;
import java.io.IOException;

public class VehicleHierarchy {

    static DataInputStream inputStream = new DataInputStream(System.in);

    public static void main(String[] args) throws IOException {
        int wheels, mileage;
        long modelNo;
        int run = 1;
        String name, regNo;
        do {
            System.out.println("Enter the number of wheels : ");
            wheels = Integer.parseInt(inputStream.readLine());
            System.out.println("Enter vehicle name : ");
            name = inputStream.readLine();
            System.out.println("Enter vehicle Reg.No. : ");
            regNo = inputStream.readLine();
            System.out.println("Enter Model No. : ");
            modelNo = Long.parseLong(inputStream.readLine());
            System.out.println("Enter mileage : ");
            mileage = Integer.parseInt(inputStream.readLine());

            switch (wheels) {
                case 2:
                    TwoWheeler vehicle2 = new TwoWheeler(name, regNo, modelNo, mileage);
                    vehicle2.display();
                    break;
                case 3:
                    ThreeWheeler vehicle3 = new ThreeWheeler(name, regNo, modelNo, mileage);
                    vehicle3.display();
                    break;
                case 4:
                    FourWheeler vehicle4 = new FourWheeler(name, regNo, modelNo, mileage);
                    vehicle4.display();
                    break;
                default:
                    System.out.println("Enter a valid choice(2/3/4) : ");
            }

            System.out.println("Do you want to continue? (0/1) : ");
            run = Integer.parseInt(inputStream.readLine());
        } while (run == 1);
    }
}

class Vehicle {

    String name;
    String regNO;
    long modelNo;

    Vehicle(String name, String regNO, long modelNo) {
        this.name = name;
        this.regNO = regNO;
        this.modelNo = modelNo;
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Registration Number : " + this.regNO);
        System.out.println("Model No : " + this.modelNo);
    }
}

class TwoWheeler extends Vehicle {

    int mileage;

    TwoWheeler (String name, String regNo, long modelNo, int mileage) {
        super(name, regNo, modelNo);
        this.mileage = mileage;
    }

    @Override
    void display() {
        System.out.println("Vehicle type : Two Wheeler");
        super.display();
        System.out.println("Mileage : " + this.mileage);
    }
}

class ThreeWheeler extends Vehicle {

    int mileage;

    ThreeWheeler (String name, String regNo, long modelNo, int mileage) {
        super(name, regNo, modelNo);
        this.mileage = mileage;
    }

    @Override
    void display() {
        System.out.println("Vehicle type : Three Wheeler");
        super.display();
        System.out.println("Mileage : " + this.mileage);
    }
}

class FourWheeler extends Vehicle {

    int mileage;

    FourWheeler (String name, String regNo, long modelNo, int mileage) {
        super(name, regNo, modelNo);
        this.mileage = mileage;
    }

    @Override
    void display() {
        System.out.println("Vehicle type : Four Wheeler");
        super.display();
        System.out.println("Mileage : " + this.mileage);
    }
}
