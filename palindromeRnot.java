package javaassignment;

import java.util.Scanner;

//a palindrome  string is a string that remains same when its characters are reversed eg;madam
public class palindromeRnot {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("eneter a string");
	String str=sc.next();
	String orgstrg=str;
	String rev="";
int len=str.length();
for (int i=len-1;i>=0;i--)
{
		
	rev=rev+str.charAt(i);
}
if (orgstrg.equals(rev))
{
	System.out.println(orgstrg+"is palindrome string");
}
else
{
	System.out.println(orgstrg+"not palindrome string");
}
	
	
		
	}
}
