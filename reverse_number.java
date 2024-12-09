package General_programs;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        int rev=0,temp;

        while(number>0){
            temp=number%10;
            rev=rev*10+temp;
            number=number/10;
        }
        System.out.println("Reverse of a number is: "+rev);
    }
}
