package javaassigment2;

public class reverse {

	public static void main(String[] args) {
		String str="welcome to xavient digital";
		String a[]=str.split("");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i] + " ");
		}
	}

}
