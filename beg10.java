import java.io.*;
import java.lang.*;
import java.util.*;
public class beg10{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
int count=0;
int n=s.nextInt();
while(n!=0){
	count++;
	n=n/10;
}
System.out.println(count);
}
}