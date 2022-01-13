package ThreadsExamples;

/**
 * Taken from Java at point | How to create thread objects in Java
 */

//There are two ways of creating a thread
//By extending the Thread class
//By implementing the Runnable interface

//Example by extending the Thread class
public class Multi extends Thread{

    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        Multi t1 = new Multi();
        t1.start();
    }
}
