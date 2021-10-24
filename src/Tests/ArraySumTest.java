package Tests;

import java.util.Arrays;
import java.util.Collections;

public class ArraySumTest {

	public static void main(String[] args) {
		ArraySumTest test= new ArraySumTest();
//		test.subArrayCount();
//		test.tripletCount();
//		test.arraySort();
		test.equiPoint();
	}
	
	public void tripletCount() {
		int A[] = { 1, 2, 2, 2, 3, 5, 6, 4, 2, 4, 6 };
		
			for(int j = 0;j<A.length-2;j++) {
				if(A[j]+A[j+1] == A[j+2]) {
					System.out.println("Sum of values at index " + j + " and " + (j+1) + " is equal to that of index " + (j+2));
					int B[] = new int[3];
					for (int k = 0; k < B.length; k++)
						B[k] = A[j + k];
					System.out.println("The sub array: " + Arrays.toString(B));}
			}}

	public void subArrayCount(){
		int A[] = { 1, 2, 2, 2, 3, 5, 6, 4, 2, 4, 6 }, s = 12;
		for (int i = 0; i < A.length; i++) {
			int temp = 0;
			for (int j = i; j < A.length; j++) {
				temp += A[j];
				if (temp == s) {
					System.out.println("Sum from index " + i + " to " + j + " is " + s);
					int B[] = new int[j - i + 1];
					for (int k = 0; k < B.length; k++)
						B[k] = A[i + k];
					System.out.println("The sub array: " + Arrays.toString(B));
				}}}}
	public void arraySort() {
		int A[] = { 1, 2, 2, 2, 3, 5, 6, 4, 2, 4, 6 }, s = 12;		
		Arrays.sort(A);		
		System.out.println("The sorted array:" + Arrays.toString(A));
	}
	
	public void equiPoint() {
		int A[] = { 9,1, 3, 2, 2, 2},s1=0,s2=0;
		for(int i=1;i<A.length-2;i++) {
			s1 = sum(A,0,i-1);
			s2 = sum(A,i+1,A.length-1);
			if(s1==s2)
				System.out.println("The euqilibrium is at index " + i);
		}		
	}
	public int sum(int[] A,int i,int j) {
		int t = 0;
		while(i<=j) {
			t = t+ A[i];
			i++;}
		return t;
		
	}
	
	
}
