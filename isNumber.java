import java.io.*;
import java.util.*;
public class isNumber {
    public static void main(String args[])
    {
       String st;
               int c=0;
       Scanner s=new Scanner(System.in);
       st=s.next();
       char p[]=st.toCharArray();
       for(int i=0;i<st.length();i++)
       {
       if(Character.isDigit(p[i]))
           c=1;
       else if(p[i]=='.')
           c=1;
       else
           c=0;
       }
           if(c==1)       
           System.out.println("true");
       else
           System.out.println("false");
    }
    
}
