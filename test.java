package exam;
import java.util.*;
public class test {

	
	public static void printpattern(String s,int n)
	{
		char a[]=s.toCharArray();
		int midIndex = n/2; 
	    for(int i=0;i<n;i++)
		{
	       int loop=i;
		    //hello
			for(int k=0;k<n-i-1;k++)
			{
				System.out.print(" ");
			}
			if(midIndex+i > n || midIndex+i == n  )
			{
				loop=midIndex;
			}
			for(int j=midIndex;j<=midIndex+loop;j++)
			{
				System.out.print(a[j]);
			}	
			if(midIndex+i > n || midIndex+i == n  )
			{
			for(int j=0;j<i-midIndex;j++)
			{
				System.out.print(a[j]);
			}
			}
			System.out.println();


		}
	    
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        int n = 7;
		String s="WELCOME";
		
		printpattern(s,n);
	}

}
