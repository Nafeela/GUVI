import java.io.*;
import java.lang.*;
import java.util.*;
public class hun10{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
int j=0;
int a[]=new int[n1];
int b[]=new int[n2];
int count=0;
for(int i=0;i<n1;i++)
	a[i]=s.nextInt();
for(int i=0;i<n2;i++)
	b[i]=s.nextInt();
for (int i = 0; i < n2; i++) { 
	for (j = 0; j < n1; j++){ 
            if(b[i] == a[j]) 
                    break; 
	}
				if(j==n1){
                System.out.println("NO");
				return;
				}
}
System.out.println("YES");
}
}