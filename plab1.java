import java.io.*;
import java.lang.*;
import java.util.*;
public class plab1{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
if(str.equals("Saturday")||str.equals("Sunday")||str.equals("sunday")||str.equals("saturday"))
	System.out.println("yes");
else
	System.out.println("no");

}
}