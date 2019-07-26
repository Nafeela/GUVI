import java.io.*;
import java.lang.*;
import java.util.*;
public class beg4{
public static void main(String[] args) throws java.lang.Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char n=(char)br.read();
if(n>='a'&&n<='z'||n>='A'&&n<='Z')
{
System.out.println("Alphabet");

}
else
	System.out.println("No");

}
}