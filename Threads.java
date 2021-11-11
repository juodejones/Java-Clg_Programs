//
//Created by Juode on 14/10/2021
//

import java.time.LocalTime;
import java.util.*;

public class Threads {

    public static void main(String[] args) {
        Thread1 thread = new Thread1();
        thread.start();
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i<10; i++) {
            try {
                int randInt = random.nextInt(100);
                System.out.println(LocalTime.now() + "\n" + randInt);
                if (isEven(randInt)) Thread2.getInstance(randInt).start();
                else Thread3.getInstance(randInt).start();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isEven(int num) {
        if (num % 2 == 0) return true;
        return false;
    }
}

class Thread2 extends Thread {
    private int x;

    public Thread2(int x) {
        this.x = x;
    }

    public static Thread2 getInstance(int x) {
        return new Thread2(x);
    }

    @Override
    public void run() {
        System.out.println( "\t" + x*x);
    }
}

class Thread3 extends Thread {
    private int x;

    public Thread3(int x) {
        this.x = x;
    }

    public static Thread3 getInstance(int x) {
        return new Thread3(x);
    }


    @Override
    public void run() {
        System.out.println( "\t" + x*x*x);
    }
}
