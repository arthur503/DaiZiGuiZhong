package com.arthur.sort;

import com.arthur.utils.Utils;

public class SortTest {
	
	public static void main(String[] argv){
		int[] array = {0,21,-3,2,31,3,11,2,2,2,3,100};
		
/*		BubbleSort bs = new BubbleSort(array);
		System.out.println("Bubble Sort result:"+Utils.arrayToString(bs.getResult()));*/
		
		InsertionSort is = new InsertionSort(array);
		System.out.println("Insertion Sort result:"+Utils.arrayToString(is.getResult()));
		
		
	}

}
