import java.io.*;
import java.lang.*;
import java.util.*;
public class hun1{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
boolean ans;
List<Integer> list=new ArrayList<Integer>();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(a[i]==a[j]){
			ans=list.contains(a[i]);
			if(!ans)
			list.add(a[i]);
		}
	}
}
Collections.sort(list);
for(int i=0;i<list.size();i++){
    System.out.print(list.get(i)+" ");
}
if(list.isEmpty())
System.out.println("unique");	
}
}