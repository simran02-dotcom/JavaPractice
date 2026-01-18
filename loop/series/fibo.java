package loop.series;

import java.util.Scanner;

public class fibo {
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.print("Enter number of terms : ");
        int n=sc.nextInt();
        System.out.print(a+" , "+b+" , " );
        for(int i=0;i<n-2;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" , " );
        }
    sc.close();
}
}