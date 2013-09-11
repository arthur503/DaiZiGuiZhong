package com.dzgz;

import com.arthur.utils.Utils;

/**
 * @陈利人
 * #面试题#给定一个无序的整数数组，怎么找到第一个大于0，并且不在此数组的整数。
 * 比如[1,2,0] 返回 3, [3,4,-1,1] 返回 2。最好能O(1)空间和O(n)时间。 关注微信公众账号“待字闺中”，了解更多。
 * */

public class Ex0910 {
	
	public static void main(String[] argv){
		
		int[][] arrays = {{3,4,-1,1},{2,1,3,4,5},{1,0,2,3,4,5},{3,1,2,6},{-3,1,2,1000},{100,200,300}};
		for(int i=0;i<arrays.length;i++){
			int[] array = arrays[i];
			Ex0910 ex = new Ex0910(array);
			System.out.println("Array is:"+Utils.arrayToString(array));
			System.out.println("Result is:"+ex.getResult());
			
		}
	}
	
	
	private int[] array;	
	public Ex0910(int[] array){
		this.array = array;
	}
	
	/**
	 * return 第一个大于0，且不在此数组的数。
	 * return N+1 if all in array， such as {1,2,3,4}。
	 */
	public int getResult(){
		int N = array.length;
		for(int i=0;i<N;i++){
			array[i] *= N;
		}
		for(int i=0;i<N;i++){
			int position = array[i]/N - 1; 	//由于答案需要大于0，且不在此数组的书，故此处N减1，使用array[i]保存i+1是否出现。返回时返回i+1即可.
			if(position >= 0 && position <N){
				array[position]++;
			}
		}
		for(int i=0;i<N;i++){
			if(array[i] % N == 0){
				return i+1;
			}
		}
		return N+1;
	}

}
