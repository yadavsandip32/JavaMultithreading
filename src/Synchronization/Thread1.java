package Synchronization;

class Thread1 extends Thread{
    Synchronization T;
    public Thread1(Synchronization T){
        this.T = T;
    }
    public void run(){
        T.displayTable(5);
    }
}