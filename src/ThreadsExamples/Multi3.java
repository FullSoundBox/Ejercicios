package ThreadsExamples;

public class Multi3 {
    public static void main(String[] args) {
        //We create the thread without using this class constructor
        Thread t = new Thread("My first thread"); //We assign the name of the thread inside the constructor

        //Then we start it using start() method
        t.start();

        //We can get the thread name with the getName method
        String str = t.getName();
        System.out.println(str);
    }
}
