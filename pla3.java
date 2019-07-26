import java.io.*;
import java.lang.*;
import java.util.*;
public class pla3{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
int sum=0,r;
int n=s.nextInt();
while(n!=0){
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
}
System.out.println(sum);
}
}