import java.util.Scanner;

class NameAndAge {

	Scanner scanner = new Scanner(System.in);

	public void  getInput(){
		System.out.println("Enter name : ");
		String name = scanner.nextLine();
		System.out.println("Enter age : ");
		int age = scanner.nextInt();

		System.out.println("\nName : " + name);
		System.out.println("Age : " + age);
	}

}