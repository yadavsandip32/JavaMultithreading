package Synchronization;

class Thread2 extends Thread{
    Synchronization T;
    public Thread2(Synchronization T){
        this.T = T;
    }
    @Override
    public void run(){
        T.displayTable(6);
    }
}
