package javaassigment2;

public class stringRnumber {

	public static void main(String[] args) {
		String str="12345Test";
		int len=str.length();
		System.out.println(onlydigits(str,len));
		
	}
	public static boolean onlydigits(String str,int n) {
		for(int i=0;i<n;i++) {
			if(str.charAt(i)<'0'|| str.charAt(i)>'9') {
				return false;
			}
			
		}
		return true;
	}

}
