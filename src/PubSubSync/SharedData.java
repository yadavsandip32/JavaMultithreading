package PubSubSync;

public class SharedData {

    private int data;
    private boolean writable = true;

    public synchronized void setData(int x) throws InterruptedException {
        if(writable==false)
            wait();
        data = x;
        System.out.println("Produced "+ x);
        writable = false;
        notify();
    }

    public synchronized int getData() throws InterruptedException {
        if(writable==true)
            wait();
        writable = true;
        notify();
        return data;
    }


}
