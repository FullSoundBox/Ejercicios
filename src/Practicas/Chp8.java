package Practicas;

import java.util.Arrays;
import java.util.Random;

public class Chp8 {

    public static void printArray(int[] a){
        System.out.print("{" + a[0]);
        for(int i=1;i<4;i++){
            System.out.print("," + a[i]);
        }
        System.out.print("}");
    }

    public static int search(double[] a, double target){
        for (int i=0; i<a.length; i++){
            if (a[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static double sum(double[] a){
        double total = 0.0;
        for(int i=0; i< a.length;i++) {
            total += a[i];
        }
        return total;
    }

    public static int[] randomArray(int size){
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static int inRange(int[] scores, int lowerLimit, int upperLimit){
        int count=0;
        for (int i = 0; i < scores.length ; i++) {
            if(scores[i]>=lowerLimit && scores[i]<upperLimit){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] count;
        double[] values;

        int size = 8;
        count = new int[4];
        values = new double[size];

        System.out.println("The zeroth value of count is " + count[0]);

        count[0] = 7;
        count[1] = count[0] * 2;
        count[2]++;
        count[3] -= 60;

        System.out.println("The values inside the array count are: " + count[0] + " " + count[1] + " " + count[2] + " " + count[3]);

        int i = 0;
        while(i<4){
            System.out.println(count[i]);
            i++;
        }

        System.out.println("Traversing with for loop");
        for (i=0; i<4; i++){
            System.out.println(count[i]);
        }

        int[] a = {1,2,3,4};
        System.out.println("Esto no imprime los valores del arreglo");
        System.out.println(a);
        System.out.println("Este si: ");
        printArray(a);

        //Utilizando la libreria Arrays en java.util
        System.out.println("\n" + "Usando la libreria Arrays en java.util");
        System.out.println(Arrays.toString(a));

        double[] a1 = new double[3];
        double[] b1 = a1;

        a1[0] = 17.0;
        System.out.println(a1[0]);
        System.out.println(b1[0]);
        //b1 is an alias of a1, that is to say, we didn't copy the array
        //we just gave it another name

        //A way creating a new array and copying it would be to cast every value in the other array
        double[] b = new double[3];
        for(i=0;i<3;i++){
            b[i]=a1[i];
        }
        System.out.println("Printing copied string: " + Arrays.toString(b));
        //Copying using Arrays library. This method allows us to copy just a part of the array
        double[] b2 = Arrays.copyOf(a1,2);
        System.out.println(Arrays.toString(b2));

        System.out.println("Creating a new array with Array.length"); //Array.length is not a method
        double[] b3 = new double[a1.length];
        for(i=0; i<a1.length; i++){
            b3[i] = a1[i];
        }
        System.out.println(Arrays.toString(b3));
        double[] b4 = Arrays.copyOf(a1,a1.length);
        b4 = Arrays.copyOf(a1, a1.length+1);
        System.out.println(b4.length);
        System.out.println(Arrays.toString(b4));

        System.out.println("Creating a new array and traversing it, replacing values with a power by 2");
        double[] a2 = {2.0,3.0,4.0};
        for(i=0; i<a2.length; i++){
            a2[i] = Math.pow(a2[i],2.0);
        }
        System.out.println(Arrays.toString(a2));
        System.out.println(search(a2,9.0));
        System.out.println(sum(a2));

        a = randomArray(a.length);
        System.out.println(Arrays.toString(a));

        int[] scores = randomArray(30);
        System.out.println(Arrays.toString(scores));
        int ran_a = inRange(scores,0,20);
        int ran_b = inRange(scores,20,40);
        int ran_c = inRange(scores,40,60);
        int ran_d = inRange(scores,60,80);
        int ran_e = inRange(scores,80,100);
        System.out.println("Histogram: " + ran_a + ", "+ ran_b + ", "+ ran_c + ", "+ ran_d + ", "+ ran_e);

        int[] counts = new int[100];
        for (int j = 0; j < counts.length; j++) {
            counts[j] = inRange(scores,j,j+1);
        }
        System.out.println(Arrays.toString(counts));

        //More efficient way
        int[] counts2 = new int[100];
        for (int j = 0; j < scores.length; j++) {
            int index = scores[j];
            counts2[index]++;
        }
        System.out.println(Arrays.toString(counts2));

        /*
        for (int j = 0; j < values.length; j++) {
            double value = values[j];
            System.out.println(value);
        }

        for (double value : values) {
            System.out.println(value);
        }*/
        int[] counts3 = new int[100];
        for (int score : scores) {
            counts3[score]++;
        }
        System.out.println(Arrays.toString(counts3));
    }
}
