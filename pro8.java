import java.io.*;
import java.lang.*;
import java.util.*;
public class pro8{
public static void main(String[] args) throws java.lang.Exception{   
  Scanner s=new Scanner(System.in);
  int gcd=1;
int n1=s.nextInt();
int in=s.nextInt();
int a[]=new int[n1];
int c[]=new int[in];

for(int i=0;i<n1;i++)
	a[i]=s.nextInt();
for(int i=0;i<in;i++){
	int b1=s.nextInt();
	int b2=s.nextInt();
	int c1=a[b1-1];
	int c2=a[b2-1];
	while(c1 != c2)
        {
            if(c1 > c2)
                c1 -= c2;
            else
                c2 -= c1;
        }
		c[i]=c1;
}
for(int i=0;i<in;i++)
	System.out.println(c[i]);
}
}