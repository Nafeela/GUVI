import java.io.*;
import java.lang.*;
import java.util.*;
public class beg9{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
int sum=0;
int n=s.nextInt();
int a=s.nextInt();
int b[]=new int[n];
for(int i=0;i<n;i++)
b[i]=s.nextInt();
for(int i=0;i<a;i++)
	sum=sum+b[i];
System.out.println(sum);
}
}