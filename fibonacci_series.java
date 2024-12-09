package General_programs;

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number upto which fibonacci series need to be printed: ");
        int n=sc.nextInt();

        int a1=0;
        int a2=1;
        int a3=0;

        System.out.println(a1);
        System.out.println(a2);

        for (int i = 2; i < n; i++) {
            a3=a1+a2;
            System.out.println(a3);
            a1=a2;
            a2=a3;
        }

    }
}
