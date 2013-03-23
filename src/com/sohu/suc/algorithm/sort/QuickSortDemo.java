package com.sohu.suc.algorithm.sort;

import org.junit.Test;

public class QuickSortDemo extends BasicDemo {
	
	/**
	 * insert sort
	 */
	@Test
	public void test(){
		printArray(basicNumber);
		quickSort(0,basicNumber.length-1);
		printArray(basicNumber);
	}
	
	private void quickSort(int start,int end) {
		int current = start;
		int compare_position = current;
		for(int i = start;i<end;i++){
			if(basicNumber[current]>basicNumber[i+1]){
				if(current != compare_position){
					swaparray(current, i+1);
					current = current + 1;
					compare_position ++;
				}else{
					swapArrayByIndex(i,i+1);
					current = i;
					current = compare_position;
				}
				
			}else{
				compare_position = i;
			}
		}
		if(start < current-1){
			quickSort(start,current-1);
		}
		if(end > current+1){
			quickSort(current+1,end);
		}
		
	}

	private void swaparray(int start, int end) {
		int start_number = basicNumber[end];
		for(int i = end ; i > start  ; i--){
			basicNumber[i] = basicNumber[i - 1];
		}
		basicNumber[start] = start_number;
	}

}
