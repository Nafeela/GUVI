import java.io.*;
import java.lang.*;
import java.util.*;
public class hun9{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int count=0;
int min,min1=0,n1=0,n2=0;
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
label1:
for (int i = 0; i < n; i++) { 
for(int j=0;j<n;j++){
if(i!=j){
min=a[i]+a[j];	
}
else
	continue;
if(min==0){
	n1=i;
	n2=j;
	break label1;
}
else{
	if(min1<min){
		min1=min;
		n1=i;
		n2=j;
	}
	
}
}

}
System.out.println(a[n1]+" "+a[n2]);
}
}