import java.io.*;
import StackOperations.*;

public class StackTesting {
    public static void main(String args[]) throws IOException
    {
        int ch,c;
        int i;
        Stack s=new Stack();
        DataInputStream in=new DataInputStream(System.in);
        do
        {
			System.out.println("\n1.Push \n2.Pop \n3.Display");
			System.out.print("\nEnter your Choice:");
			ch=Integer.parseInt(in.readLine());
			switch(ch)
			{
				case 1:
					System.out.println("Enter value :");
					i=Integer.parseInt(in.readLine());
					s.push(i);
					break;
				case 2:
					s.pop();
					break;
				case 3:
					System.out.println("Elements are: ");
					s.display();
					break;
				default:
					System.out.println("Invalid choice!");
			}
            System.out.println("\nEnter 0 to quit / 1 to continue ");
            c=Integer.parseInt(in.readLine());
        }while(c==1);
    }
}
