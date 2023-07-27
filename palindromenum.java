package javaassigment2;

import java.util.Scanner;

public class palindromenum {
	public static void main(String[] args) {
		
		
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("eneter the number");
	int a=sc.nextInt();
	int b=a;
	int rev=0;
	while(a != 0)
	
	{
		rev=rev*10 + a%10;
		a=a/10;
		
		
	}
	if(b==rev)
	{
	System.out.println("num is palindrome");
	}
	else
	{
		System.out.println("num is not palindrome");
	}
	}
}
}
	
	
	

