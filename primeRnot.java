package javaassignment;
//natural number >1
//which has only 2 factors 1 and itself
//5---1&5-prime
//4----1,2,4--not prime

public class primeRnot {
	public static void main(String[] args) {
		int num=5;
		int count=0;
		if( num>1 )
			
		{
			for (int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
				
			}
			if(count==2)
			{
			System.out.println("prime number");	
			}
			else
			{
				System.out.println("not prime number");
			}
		}
		else
		{
			System.out.println("not prime number");
		}
	}

}
