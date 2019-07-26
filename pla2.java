import java.io.*;
import java.lang.*;
import java.util.*;
public class pla2{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
int fact=1;
int n=s.nextInt();
for(int i=1;i<=n;i++)
	fact=fact*i;
System.out.println(fact);
}
}