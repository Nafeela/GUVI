import java.io.*;
import java.lang.*;
import java.util.*;
public class beg12{
public static void main(String[] args) throws java.lang.Exception{
int r,sum=0,temp;    
  Scanner s=new Scanner(System.in);
int n=s.nextInt();//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("yes");    
  else    
   System.out.println("no");  

}
}