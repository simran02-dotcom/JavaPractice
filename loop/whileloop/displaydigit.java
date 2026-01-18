package loop.whileloop;
import java.util.*;
public class displaydigit {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        System.out.println("Digits of " +n+" are : ");
        while(n!=0){
           
            int r=n%10;
             n=n/10;
            System.out.println(r);
        }
        sc.close();}
}
