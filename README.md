# JavaMultithreading

 


To use thread we have to create a object of thread class.
When we create Thread object it is added in thread pool area of RAM.
When we call start method on it, but default run is also called.
When the run is called, the OS schedules the thread object execution in CPU.

Run method is empty and it is called from start method.

We should not directly call run()



![image](https://github.com/yadavsandip32/JavaMultithreading/assets/20738229/b389e6ec-2f6c-4877-b6f7-6cac0a37c917)


![image](https://github.com/yadavsandip32/JavaMultithreading/assets/20738229/a52d555d-caf5-4a24-a539-6d14dab3c78b)


When we create a thread manually, the first thread gets named as “thread-0”, and the next thread “thread-1” and so on..

When we run start() method on thread object, it create thread in thread pool and creates a call stack with name of this thread.
As you can see in image thread-0 and thred-1 call stack.

![image](https://github.com/yadavsandip32/JavaMultithreading/assets/20738229/fae1b9e8-4416-42eb-81fd-3cbc00dce205)


When we directly try to run the run() method on thread object, it add the entry in the mail call stack itself, thus loosing the essense of multithreading.

 ![image](https://github.com/yadavsandip32/JavaMultithreading/assets/20738229/e7b0abe5-7be9-4b29-a0e5-09124c3e9866)



When Thread object created, born state
When start() is called, runnable state,
When sleep() is called, blocked state.





In Java, the join() method is used to make one thread wait for another thread to complete its execution. This is particularly useful when you have multiple threads running concurrently, and you want to ensure that some specific thread finishes its execution before the rest of the program continues. Here's how the join() method works:

public class JoinExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        thread1.start(); // Start Thread 1
        thread2.start(); // Start Thread 2

        try {
            thread1.join(); // Wait for Thread 1 to finish
            thread2.join(); // Wait for Thread 2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished.");
    }
}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started.");
        try {
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " finished.");
    }
}


![image](https://github.com/yadavsandip32/JavaMultithreading/assets/20738229/b0a87cdb-0fad-4ed3-98cc-271b0a7333ea)
Thread lifecycle

![image](https://github.com/yadavsandip32/JavaMultithreading/assets/20738229/24858dbf-08b6-40ad-bc4e-9c26668a28e5)


			Synchronized


![image](https://github.com/yadavsandip32/JavaMultithreading/assets/20738229/459ffa1d-8ac1-4be5-bae2-011ed12792a7)
