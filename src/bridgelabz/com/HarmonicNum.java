package bridgelabz.com;

import java.util.Scanner;

public class HarmonicNum {

    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);

        System.out.println("Enter the number");

        int num= obj.nextInt();

        double N=0;
        for(double i=1;i<=num;i++){
            N=N+ 1/i;
            System.out.println("harmonic num"+num+"number is:"+N);
        }







        }


    }

