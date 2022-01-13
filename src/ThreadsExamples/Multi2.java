package ThreadsExamples;

public class Multi2 implements Runnable{

    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        Multi2 m1 = new Multi2();
        Thread t1 = new Thread(m1); //We use the constructor with the runnable instance

        t1.start();
    }
}
