public class JoinTestThread extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + " "+ Thread.currentThread().getName());
        }
    }
}
