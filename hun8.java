import java.io.*;
import java.lang.*;
import java.util.*;
public class hun8{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int count=0;
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
for (int i = 0; i < n; i++) { 
for(int j=i;j<n;j++){
	for(int k=j;k<n;k++){
		if(a[i]+a[j]==a[k]&&i!=j&&j!=k)
			System.out.println(a[i]+" "+a[j]+" "+a[k]);
	}
}
}
}
}