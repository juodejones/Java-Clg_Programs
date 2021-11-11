import java.util.ArrayList;
import java.util.Scanner;

class LuckyNumber {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int t;

        t = scanner.nextInt();


        if (t >= 1 && t <= 1000) {
            ArrayList<ArrayObj> a = new ArrayList<>(t);
            for (int i = 0; i < t; i++) {
                ArrayObj a1 = new ArrayObj();
                a1.createDigit();
                a.add(a1);
            }

            for (ArrayObj a1 : a) {

                for (int i = 0; i < 3; i++) {
                    int[] array = a1.getDigit();


                    if (array[i] == 7) {
                        System.out.println("YES");
                        break;
                    } else if (array[i] != 7 && array.length == i + 1) {
                        System.out.println("NO");
                        break;
                    }
                }
            }
        }
    }
}

class ArrayObj{

    private int[] digit;
    private int t;
    public ArrayObj(){
        this.digit = new int[3];
    }

    public void createDigit(){
        Scanner scanner = new Scanner(System.in);
        int n;
        for (int j = 0 ; j < digit.length; j++){
            n =  scanner.nextInt();
            if( n >=0 && n <= 9 )
                digit[j] = n;
        }
        scanner.nextLine();
    }

    public int[] getDigit() {
        return digit;
    }
}