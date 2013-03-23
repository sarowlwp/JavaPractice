package com.sohu.suc.algorithm.sort;

import org.junit.Test;

public class SelectionSortDemo extends BasicDemo {
	
	/**
	 * select sort
	 */
	@Test
	public void test(){
		for(int i=0 ; i<basicNumber.length;i++){
			//select
			int temp = basicNumber[i];
			//target data position
			int temp_position = i;
			for(int j=i;j<basicNumber.length-1;j++){
				if(temp > basicNumber[j]){
					temp = basicNumber[j];
					temp_position = j;
				}
			}
			swapArrayByIndex(i,temp_position);
			printArray(basicNumber);

		}
	}

}
