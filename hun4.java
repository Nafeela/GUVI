import java.io.*;
import java.lang.*;
import java.util.*;
public class hun4{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int count=0;
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
for (int i = 0; i < n; i++) { 
            int j; 
            for (j = 0; j < n; j++) 
                if (i != j && a[i] == a[j]) 
                    break; 
            if (j == n) 
                System.out.println(a[i]); 
        } 
}
}
