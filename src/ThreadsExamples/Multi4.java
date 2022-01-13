package ThreadsExamples;

public class Multi4 implements Runnable{
    public void run(){
        System.out.println("Now the thread is running...");
    }

    public static void main(String[] args) {
        Runnable m1 = new Multi4();
        Thread t1 = new Thread(m1,"My new Thread"); //This constructor gets a runnable class and a title

        t1.start(); //We start the thread
        String str = t1.getName();
        System.out.println(str);
    }
}
