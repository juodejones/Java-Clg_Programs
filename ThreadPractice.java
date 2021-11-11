import java.util.*;

public class ThreadPractice {
	public static void main(String args[]) {
		GetInput in = new GetInput();
		in.run();
	}
}

class GetInput implements Runnable {
	private int a[];
	private Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		sc.nextLine();
		a = new int[n];
		for (int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
			sc.nextLine();
		}
	}

	public int[] getA() {
		return a;
	}
}

class DivBy5 extends GetInput {
	@Override
	public void run() {
		for (int i : getA()) {
			if (i%5 == 0) System.out.println(i + "\t");
		}
	}
}

class PrimeNumbers extends GetInput {
	@Override
	public void run() {
		for (int i : getA())
			if (isPrime(i)) System.out.println( i + "\t");
	}

	private boolean isPrime(int n) {
		for (int i = 2; i < n/2; i++)
			if (n%i == 0) return false;
		return true;
	}
}

class Average extends GetInput {
	int sum = 0, n = 0;

	@Override
	public void run() {
		for (int i : getA()) {
			sum += i;
			n++;
		}
		System.out.println("Average = " + sum/n);
	}
}
