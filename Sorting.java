import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sorting{

public static  void swap(int a,int b)
{
	int temp;
	temp=a;
	a=b;
	b=temp;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        
        int numswaps=0;
       for(int i=0;i<n;i++)
       {
        	try{
        	for(int j=0;j<n-1;j++)
        	{
        		if(a[j]>a[j+1])
        		{
        			
        			int temp;
        			temp=a[j];
        			a[j]=a[j+1];
        			a[j+1]=temp;
        			numswaps++;
        			
        			
        		}

        	}
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        	
        	}

        
        System.out.println("Array is sorted in "+numswaps+" swaps.");
        System.out.println("First element: "+a[0]);
        System.out.println("Last element: "+a[n-1]);

        
    }
}
