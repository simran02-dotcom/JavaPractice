package loop;
import java.util.*;
public class practice3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int mul=1;
        System.out.print("Enter a number of which you want factorial :");
        int n=sc.nextInt();
        System.out.print("Factorial of " +n+" is : ");
        for(int i=1;i<=n;i++){
            mul=mul*i;
        }
        System.out.print(mul);
        sc.close();
    }
    
}