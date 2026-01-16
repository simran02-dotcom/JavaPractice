

import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              int a,b,c;
              System.out.println("Menu \n1.ADD \n2.SUB \n3.MUL \n4.DIV ");
              System.out.println("Enter two numbers :");
              a=sc.nextInt();
              b=sc.nextInt();
              System.out.println("a= " +a+" b= "+b);
              System.out.println("Enter option :");
              int choice=sc.nextInt();
              switch(choice){
                     case 1: c=a+b;
                     System.out.println("Addition is " +c);
                     break;

                     case 2: c=a-b;
                     System.out.println("Subraction is " +c);
                     break;

                      case 3: c=a*b;
                     System.out.println("Multiplication is " +c);
                     break;

                      case 4: c=a/b;
                     System.out.println("Division is " +c);
                     break;

                     default :System.out.println("Invalid input");
                     break;
              }
              sc.close();
       }
}