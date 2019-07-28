import java.io.*;
import java.lang.*;
import java.util.*;
public class pla6{
public static void main(String[] args) throws java.lang.Exception{
Scanner s=new Scanner(System.in);
String InputValue=s.nextLine();
String[] Value =InputValue.split(" ");
String n = Value[0];
String k = Value[1];
areIsomorphic(n,k); 
}
private static void areIsomorphic(String s1, String s2) {
        if (s1.length() == s2.length()) {
            s1 = s1.toLowerCase();
          s2 = s2.toLowerCase();
            if (s1.equals(s2)) {
                System.out.println("yes");
            } 
			else {
                boolean isomorphic = true;
                Map<Character, Character> map = new HashMap<Character, Character>(
                        0);
                for (int i = 0; i < s1.length(); i++) {
                    char c1 = s1.charAt(i);
                    char c2 = s2.charAt(i);
                    if (map.containsKey(c1)) {
                        if (map.get(c1) != c2) {
                            isomorphic = false;
                            break;
                        }
                    } else {
                        if (map.containsValue(c2)) {
                            /*
                             * If the character c2 is already mapped to some
                             * other character in String1 then it cannot be
                             * mapped again to c1
                             */
                            isomorphic = false;
                            break;
                        } else {
                            map.put(c1, c2);
                        }
                    }
                }
                if (isomorphic) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        } 
		else {
            System.out.println("no");
        }
    }
}