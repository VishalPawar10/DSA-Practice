package in.ashokit.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		//int arr[] = {3,5,1,2,9}; //unsorted array is passed
		int arr[] = {1, 2, 3, 5, 9}; //sorted array is passed
		BubbleSortMethod(arr);
        
	}
	
	public static void BubbleSortMethod(int arr[]) {
		int count=0;
		for(int i=0; i<arr.length;i++) {
			boolean flag=false;
			for(int j=0; j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag=true;
				}
				count++;
			}
			if(flag==false) {
				break;
			}
		}
		
	    System.out.println(count);
		System.out.println(Arrays.toString(arr));
	}

}
