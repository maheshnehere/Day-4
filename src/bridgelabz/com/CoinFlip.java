package bridgelabz.com;
import java.util.Scanner;
import java.util.Random;

public class CoinFlip {

    public static void main(String[] args) {

         int Tails=0;

         int Heads =0;

         int count= 1;

         double randum = 0.0;
Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number of flips");

        int flip=obj.nextInt();

        while (count<=flip) {
            randum = Math.random();
            System.out.println(count + " " + randum);

            if (randum < 0.5) {
                Tails++;
                System.out.println("Tails");
            } else if (randum > 0.5) {
                Heads++;
                System.out.println("Heads");
            }
            count++;

        }
        System.out.println("Number of heads:"+Heads);
        System.out.println("Number of tails:"+Tails);

        double headpercent=(double) Heads/flip*100;
        double tailpercent=(double) Tails/flip*100;

        System.out.println("percentage of heads:"+headpercent);
        System.out.println("percentage of tails:"+tailpercent);
    }
}
