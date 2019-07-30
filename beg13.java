import java.io.*;
import java.lang.*;
import java.util.*;
public class beg13{
public static void main(String[] args) throws java.lang.Exception{
int r,sum=0,temp;    
  Scanner s=new Scanner(System.in);
int n=s.nextInt();

        boolean flag = false;
        for(int i = 2; i <= n/2; ++i)
        {
            // condition for nonprime number
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("yes");
        else
            System.out.println("no");

}
}