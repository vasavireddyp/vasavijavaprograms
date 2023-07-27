package javaassignment;
import java.util.Scanner;
public class centuryyearRnot {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the year");
	   int year=sc.nextInt();
	if(year%100==0 && year%400==0)
		System.out.println("given year is century year");
	else {
  System.out.println("given year is not century year");
   }
   }
}
