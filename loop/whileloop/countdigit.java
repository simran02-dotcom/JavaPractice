package loop.whileloop;

import java.util.Scanner;

public class countdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        int count=0;
        System.out.print("Count of digit " +n+" is : ");
        while(n!=0){
             n=n/10;
             count=count+1;
        }
        System.out.print(count);
        sc.close();}
}
