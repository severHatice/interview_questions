package inteview_questions01;

import java.util.Arrays;

public class OCA10_FindDifferenceBetween2ElemInArray {

	public static void main(String[] args) {
		/*
		 Create a function that takes an array and returns the difference between
		 and the smallest numbers.
		 Ask user to enter array elements.

		kullanicinin girdigi bir array'in en buyuk elemani ile 
		en kucuk elemaninin  farkini bulan bir method create ediniz.
		 */
		
		int []arr= {10,2,3,5,8,3};
		int kucuk=0;
		int buyuk=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					buyuk=arr[i];
					
				}
			
		}Arrays.sort(arr);

	}System.out.println(buyuk-arr[0]);
		

	}}
