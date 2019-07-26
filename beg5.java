import java.io.*;
import java.lang.*;
import java.util.*;
public class beg5{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a>b&&a>c)
	System.out.println(a);
else if(b>c)
	System.out.println(b);
else
	System.out.println(c);
}
}