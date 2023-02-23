package bridgelabz.com;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);

        System.out.println("Enter the number");

        int num=obj.nextInt();

        if(num%2==0){
            System.out.println("Evennumber:"+num);
        }
        else  {

            System.out.println("Oddnumber:"+num);

        }

    }
}
