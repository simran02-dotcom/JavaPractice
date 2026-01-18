package loop;
import java.util.*;
public class practice2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter a number upto which you want the sum :");
        int n=sc.nextInt();
        System.out.print("Sum of " +n+" is : ");
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.print(+sum);
        sc.close();
    }
    
}
