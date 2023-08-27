package Synchronization;

public class SynchronizedTable extends Thread{
    public static void main(String[] args) {
        Synchronization table = new Synchronization();

        Thread1 th1 = new Thread1(table);
        Thread2 th2 = new Thread2(table);

        th1.start();
        th2.start();

    }
}