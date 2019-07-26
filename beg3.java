import java.io.*;
import java.lang.*;
import java.util.*;
public class beg3{
public static void main(String[] args) throws java.lang.Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char n=(char)br.read();
if(n>='a'&&n<='z'||n>='A'&&n<='Z')
{
	if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
	System.out.println("Vowel");
	else
	System.out.println("Consonant");

}
else
	System.out.println("invalid");

}
}