package General_programs;

import java.util.Scanner;

public class count_number_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        int count=0;

        if (num<0){
            System.out.println("Number should be greater than 0");
        }
        else if (num==0){
            System.out.println("count is 1");
        }
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
