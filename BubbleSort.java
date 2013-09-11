package com.arthur.sort;

import com.arthur.utils.Utils;

public class BubbleSort {
	
	private int[] array;
	/**
	 * 冒泡排序，返回从小到大的结果。
	 * @param array
	 */
	public BubbleSort(int[] array){
		this.array = array;
		sort();
	}
	
	public void sort(){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i] > array[j]){
					swap(i,j);
				}
//				System.out.println("Bubble Sort: "+Utils.arrayToString(array));
			}
			
		}
	}
	
	private void swap(int i, int j) {
		// TODO Auto-generated method stub
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public int[] getResult(){
		return array;
	}
	
}
