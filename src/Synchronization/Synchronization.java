package Synchronization;

class Synchronization {

    public synchronized void displayTable(int n){
        // synchronization(this){ add critical section code block}
        for(int i =1; i<n; i ++){
            System.out.println(n*i);
        }
    }
    // To use with a static method
    // You can define in the method declaration like above or
    // You can synchronize on .class file of class
    public synchronized void displayStaticTable(int n){
        // synchronized(Synchronization.class){add critical section code block}
        for(int i =1; i<n; i ++){
            System.out.println(n*i);
        }
    }
}