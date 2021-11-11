import java.io.*;

class QueueInterface {

    private static DataInputStream inputStream = new DataInputStream(System.in);

    public static void main(String args[]) throws IOException{
        int choice;
        boolean run = true;
        Queue queue = new Queue();

        while (run) {
            System.out.println("\n\t1.Enqueue\n\t2.Dequeue\n\t3.Prioritize\n\t4.Display" +
                    "\n\t5.Exit\nEnter your choice : ");
            choice = Integer.parseInt(inputStream.readLine());

            switch(choice) {

                case 1:
                    System.out.println("Enter a number : ");
                    queue.enqueue(Integer.parseInt(inputStream.readLine()));
                    break;
                case 2:
                    if (queue.dequeue())
                        System.out.println("Dequeue Successfull");
                    else
                        System.out.println("Dequeue unsuccessfull");
                    break;
                case 3:
                    System.out.println("Enter a number to prioritize : ");
                    queue.prioritize(Integer.parseInt(inputStream.readLine()));
                    break;
                case 4:
                    queue.print();
                    break;
                case 5:
                    run = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}

class Queue implements Operations{

    int front = -1, rear = -1, i;
    int queue[] = new int[10];

    public boolean enqueue(int num) {
        try {
            if (front == -1) front++;
            if (rear < 9) {
                queue[++rear] = num;
                return true;
            }
            throw new MyException("Queue is Full");

        } catch (MyException e) {
            System.out.println("Exception occured : " + e.getMessage());
        }
        return false;
    }

    public boolean dequeue() {
        try {
            if (rear == -1) {
                throw new MyException("Queue is Empty");
            }
            for (int i = front; i <= rear; ++i ) {
                queue[i] = queue[i+1];
            }
            rear--;
            return true;
        } catch (MyException e) {
            System.out.println("Exception occured : " + e.getMessage());
        }
        return false;
    }

    public boolean prioritize(int num) {
        if (rear == 9) return false;
        if (rear == -1) {
            enqueue(num);
            return true;
        }
        for (int i = rear; i > front; i-- ) {
            queue[i] = queue[i-1];
        }
        queue[front] = num;
        return true;
    }

    public void print() {
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i] + "\t");
        }
    }
}

interface Operations {
    boolean enqueue(int num);
    boolean dequeue();
    boolean prioritize(int num);
    void print();
}

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}
