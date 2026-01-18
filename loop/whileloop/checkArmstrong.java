package loop.whileloop;
import java.util.*;
public class checkArmstrong {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int digit=0;
      System.out.println("Enter a number :");
      int n =sc.nextInt();
      int m =n;
      while(n!=0){
        int r=n %10;
         digit= digit +(r*r*r);
        n=n/10;
      }
    //   System.out.println(digit);
      if(digit==m){
        System.out.print(m+" is a Armstrong Number.");
      }
      else{
        System.out.print(m+" is not a Armstrong Number.");
      }
      sc.close();
    }
}
