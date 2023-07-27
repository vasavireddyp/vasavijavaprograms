package javaassignment;

public class multipleofthreeandfive {
	public static void main(String[] args) 
	{
		findmultiples(100);
	}
	public static void findmultiples(int n) {
		
		for(int i=0;i<=n;i++)
			if(i%3==0 && i%5==0)
				System.out.println(i);
	}

}
