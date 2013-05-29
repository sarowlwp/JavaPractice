package com.sohu.suc.algorithm.sort;

import org.junit.Test;

public class FindMergeDemo extends BasicDemo {
	
	/**
	 * swap
	 */
	@Test
	public void test(){
		int[] basic_array = {0,1,10,11,12,17,18,23,26,29,78,90};
		int find = 29;
		int start = 0;
		int end = basic_array.length-1;
		if(basic_array[start]>find){
			System.out.println("no one small than you!");
			return;
		}
		while(basic_array[end]>find){
			System.out.println("kick out : " + basic_array[end]);
			end --;
		}
		while(basic_array[start] < basic_array[end]){
			if(basic_array[start] + basic_array[end] == find){
				System.out.println("result : "+ basic_array[start] + " | " + basic_array[end]);
				start ++;
			}
			if(basic_array[start] + basic_array[end] > find){
				end--;
			}
			if(basic_array[start] + basic_array[end] < find){
				start ++;
			}
		}
			
	}

}
