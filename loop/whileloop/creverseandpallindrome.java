package loop.whileloop;
import java.util.*;
public class creverseandpallindrome {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rev=0;
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        int m=n;
        while(n!=0){
           
            int r=n%10;
            rev=(rev*10+r);
             n=n/10;
            
        }
        System.out.println("Reverse is : " +rev);
        if(rev==m){
        System.out.print(m+" is a Pallindrome Number.");
      }
      else{
        System.out.print(m+" is not a Pallindrome Number.");
      }
        sc.close();}
}
