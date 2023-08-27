package PubSubSync;

public class Consumer extends Thread{
    SharedData d;
    Consumer(SharedData sd){
        this.d = sd;
    }

    @Override
    public void run() {
        for (int i=1;i<=100;i++) {
            try {
                System.out.println("From Consumer " + d.getData());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
