package com.arthur.sort;

import com.arthur.utils.Utils;

public class InsertionSort {

	private int[] array;
	
	/**
	 * 插入排序算法。
	 * 结果从小到大排列。
	 * @param array
	 */
	public InsertionSort(int[] array){
		this.array = array;
		System.out.println("Array is:"+Utils.arrayToString(array));
		sort();
	}
	
	private void sort() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<array.length-1;i++){
			int postion = i+1;
			//若新元素大，直接继续。
			if(array[postion] >= array[i]){
				continue;
			}
			//若新元素小，移动元素并赋值。
			int j=i;
			int tmp = array[postion];
			while(j >= 0 && array[j] > tmp){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = tmp;			//这一步错写成array[j] = tmp; 浪费了好多时间。	
		}			
	}
	
	public int[] getResult(){
		return array;
	}
	
}
