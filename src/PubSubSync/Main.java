package PubSubSync;

import java.lang.invoke.ConstantCallSite;

public class Main {
    public static void main(String[] args){

        SharedData sd = new SharedData();
        Consumer c = new Consumer(sd);
        Producer p = new Producer(sd);
        p.start();
        c.start();
    }
}
