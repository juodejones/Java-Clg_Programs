import java.util.Scanner;

public class TestSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ind = 0, eng = 0, draw = 0;
        int arr[][] = new int[10][10];
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < 5; ++j) {
                arr[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 0) draw++;
                else if (arr[i][j] == 1) ind++;
                else eng++;
            }
            if (ind > eng) System.out.println("INDIA");
            else if (eng > ind) System.out.println("ENGLAND");
            else System.out.println("DRAW");
            ind = eng = draw = 0;
        }
    }
}
