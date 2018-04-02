import java.io.*;
import java.util.*;
class Binary

{
	static int[] addElement(int[] a,int e)
	{
		a=Arrays.copyOf(a,a.length+1);
		a[a.length-1]=e;
		return a;
	}
	static void reversearray(int[] a,int start,int end)
	{
		int temp;
		while(start<end)
		{
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a={};
		while(n!=0)
		{
			int b;
			b=n%2;
			a=addElement(a,b);
			n=n/2;

		}
		reversearray(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
		System.out.println("\n");
		int[]d={};
		int c=1;
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]==a[i-1]&&a[i]==1)
			{
				c++;
			}
			if(a[i]==0)
			{	
				d=addElement(d,c);
				c=1;
			}
			if(i==a.length-1)
			{
				d=addElement(d,c);
			}
		}
		Arrays.sort(d);
		System.out.println(d[d.length-1]);
		for(int i=0;i<d.length;i++)
		{
		System.out.println(d[i]);
		}
	}
}