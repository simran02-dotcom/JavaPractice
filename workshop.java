
import java.lang.*;
public class workshop {
    public static void main (String[] args)
    {
    
        String name= "webgurukul";
        for (int i=0;i<name.length();i++)
        {  char ch=name.charAt(i);
           if(i%2==0)
           {
            System.out.print(Character.toUpperCase(ch));

           }
           else{
            System.out.print(Character.toLowerCase(ch));

           }
    
    }
    }}
