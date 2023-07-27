package javaassignmentArrays;

public class Twodimentionalarray {

	public static void main(String[] args) {
		int[][] arr= {{1,2},{3,4},{5,6}};
		//arr[0][0]=1;
		//arr[0][1]=2;
		
		//arr[1][0]=3;
		//arr[1][1]=4;
		
		//arr[2][0]=5;
		//arr[2][1]=6;
//for(int i=0; i<arr.length; i++) {
			
			//for(int j=0; j<arr[i].length; j++)
		//System.out.println(arr[i][j]+ " ");
		//System.out.println();
		int row=arr.length;
		int coloumn=arr[0].length;
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<coloumn; j++) {
				int value=arr[i][j];
				System.out.println(value+ " " );
			}
			System.out.println();
		}
		
	}

}
