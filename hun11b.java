import java.io.*;
import java.lang.*;
import java.util.*;
public class hun11b{
public static void main(String[] args) throws java.lang.Exception{
	Scanner s=new Scanner(System.in);
String str=s.nextLine();
String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    System.out.println(reverseWord);
}
}