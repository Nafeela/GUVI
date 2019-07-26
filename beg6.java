import java.io.*;
import java.lang.*;
import java.util.*;
public class beg6{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
int y=s.nextInt();
if(y%100==0){
	if(y%400==0)
		System.out.println("yes");
	else
		System.out.println("no");
}
else{
if(y%4==0)
System.out.println("yes");
else
System.out.println("no");
}	
}
}