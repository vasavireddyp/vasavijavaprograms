package javaassignmentArrays;

import java.util.Arrays;

public class ascendingArray {

	public static void main(String[] args) {
		int a[]= {10,30,50,40,20};
		System.out.println("before ascending" + Arrays.toString(a));
		int n=a.length;
		for(int i=0;i<n-1;i++){
		for(int j=0;j<n-1;j++){
		if(a[j]>a[j+1]) {
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			
		}
	}
		}
		System.out.println("after ascending" + Arrays.toString(a));
	}
}
	


