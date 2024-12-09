package General_programs;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int input=sc.nextInt();
        int actualnum=input;
        double result=0;

        while(actualnum>0){
            int n=actualnum%10;
            result=result+n*n*n;
            actualnum=actualnum/10;
        }

        if (result==input){
            System.out.println(input+" is an Armstrong number");
        }
        else {
            System.out.println(input+" is not an Armstrong number");
        }
    }
}
