package PubSubSync;

public class Producer extends Thread{
    SharedData d;
    Producer(SharedData sd){
        this.d = sd;
    }

    @Override
    public void run() {
        for (int i=1;i<=100;i++) {
            try {
                d.setData(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
