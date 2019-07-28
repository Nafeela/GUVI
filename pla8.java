import java.io.*;
import java.lang.*;
import java.util.*;
public class pla8{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
StringBuilder result = new StringBuilder(str.length());
String words[] = str.split(" ");
for(int i=0;i<words.length;i++){
	result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
}
System.out.println(result);

}
}