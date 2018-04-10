import java.io.*;
import java.util.*;

public class Rtac {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
     
        long []a=new long[30];
        for(int i=0;i<T;i++)
        {
            a[i]=scan.nextLong();
        }
        for(int i=0;i<T;i++)
        {
               int flag=0;

            for(int j=2;j<=(a[i]/2);j++)
            {
                if(a[i]%j==0)
                {
                    System.out.println("Not prime");
                    flag=1;
                    break;
                }
            }
             if(a[i]==0||a[i]==1)
               {
                flag=1;
                System.out.println("Not prime");
               }
            if(flag==0)
            System.out.println("Prime");
        }
    }
}