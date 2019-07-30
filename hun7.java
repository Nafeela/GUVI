import java.io.*;
import java.lang.*;
import java.util.*;
public class hun7{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int count=0;
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
for (int i = 0; i < n; i++) { 
        if(i%2==0&&a[i]%2!=0)
			System.out.print(a[i]+" ");
		else if(i%2!=0&&a[i]%2==0)
			System.out.print(a[i]+" ");
		else
			continue;
			
} 
}
}
