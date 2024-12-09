package General_programs;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        int rev=0;int sum=0;

        while (num>0) {
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("Total sum is: "+sum);

   }
}
