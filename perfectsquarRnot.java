package javaassignment;
import java.util.Scanner;
public class perfectsquarRnot {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a number");
		Integer num=sc.nextInt();
		for(int i=1;i<num;i++) {
			if(i*i==num)
				System.out.println("given number is perfect squar");
		}
	 {
			System.out.println("given number is not perfect squar");
		
	}

}
}

