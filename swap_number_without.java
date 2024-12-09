package General_programs;

import java.util.Scanner;

public class swap_number_without {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        System.out.println("Enter 2nd number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swapping : a ="+a+ ", b ="+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping : a ="+a+ ", b ="+b);
    }
}
