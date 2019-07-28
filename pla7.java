import java.io.*;
import java.lang.*;
import java.util.*;
public class pla7{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
char tmp;
String sam=s.nextLine();
char[] str=sam.toCharArray();
for(int i=0;i<str.length;i=i+2){
     tmp = str[i];
     str[i] = str[i+1];
     str[i+1] = tmp;
     }
	 System.out.println(str);
}
}