public class RunnableThread implements Runnable{

    // for th2
    RunnableThread(){
        new Thread(this).start();
    }
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(i + " "+ Thread.currentThread().getName());
        }
    }

}
