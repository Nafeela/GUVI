import java.io.*;
import java.lang.*;
import java.util.*;
public class beg2{
public static void main(String[] args) throws java.lang.Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
if(n<0)
	System.out.println("invalid");
else if(n%2==0)
	System.out.println("Even");
else
	System.out.println("Odd");
}
}