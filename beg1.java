import java.io.*;
import java.lang.*;
import java.util.*;
public class beg1{
public static void main(String[] args) throws java.lang.Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
if(n<0)
	System.out.println("Negative");
else if(n>0)
	System.out.println("Positive");
else
	System.out.println("Zero");
}
}