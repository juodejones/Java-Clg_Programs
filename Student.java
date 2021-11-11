import java.util.*;
import java.io.*;

public class Student {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		inFunc();
		outFunc();
	}
	
	public static void inFunc() throws IOException {
		BufferedWriter file = new BufferedWriter(new FileWriter("/home/juode/Documents/IN.txt"));
		for(int i = 0; i<5; i++){
			file.write(sc.nextLine());
		}
	}

	public static void outFunc() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("/home/juode/Documents/IN.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("/home/juode/Documents/OUT.txt"));
		while (true) {
			String str = in.readLine();
			if (str == null) break;
			out.write(str.toLowerCase());
			System.out.println("Writing : " + str);
		}
	}
}
