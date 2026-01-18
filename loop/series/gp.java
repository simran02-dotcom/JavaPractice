package loop.series;

import java.util.Scanner;

public class gp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a,r and n number :");
        int a=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();
        int term=a;
        for(int i=0;i<n;i++){
           System.out.print(term +" , ");
           term=term*r;
        }
        sc.close();
}
}
