import java.io.*;
import java.lang.*;
import java.util.*;
public class pro2{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
String InputValue=s.nextLine();
String[] Value =InputValue.split(" ");
String n = Value[0];
int k = Integer.parseInt(Value[1]);
//String n=s.nextLine();
//int k=s.nextInt();
//String s=String.valueOf(n);
String ans=removeKdigits(n,k);
System.out.println(ans);
}
static String removeKdigits(String num, int k) {
    if(num.length()==k)
		
        return "0";
 
    StringBuilder sb = new StringBuilder(num);
    for(int j=0; j<k; j++){
        int i=0;
        while(i<sb.length()-1&&sb.charAt(i)<=sb.charAt(i+1)){
            i++;
        }
        sb.delete(i, i+1);
    }
 
    //remove leading 0's        
    while (sb.length() > 1 && sb.charAt(0)=='0')
        sb.delete(0,1);
 
    if(sb.length()==0){
        return "0";
    }
 
    return sb.toString();
}
}