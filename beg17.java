import java.io.*;
import java.lang.*;
import java.util.*;
public class beg17{
public static void main(String[] args) throws java.lang.Exception{   
  Scanner s=new Scanner(System.in);
int n=s.nextInt();
 int c=0,a,temp;  
    //It is the number to check armstrong  
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("yes");   
    else  
        System.out.println("no");
}
}