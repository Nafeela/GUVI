import java.io.*;
import java.lang.*;
import java.util.*;
public class hun6{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int count=0;
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int min = -1; 
  
        // Creates an empty hashset 
        HashSet<Integer> set = new HashSet<>(); 
  
        // Traverse the input array from right to left 
        for (int i=a.length-1; i>=0; i--) 
        { 
            // If element is already in hash set, update min 
            if (set.contains(a[i])) 
                min = i; 
  
            else   // Else add element to hash set 
                set.add(a[i]); 
        } 
  
        // Print the result 
        if (min != -1) 
          System.out.println(a[min]); 
        else
          System.out.println("unique"); 
    } 
  
}

