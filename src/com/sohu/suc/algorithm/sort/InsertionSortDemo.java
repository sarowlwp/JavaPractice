package com.sohu.suc.algorithm.sort;

import org.junit.Test;

public class InsertionSortDemo extends BasicDemo {
	
	/**
	 * insert sort
	 */
	@Test
	public void test(){
		for(int i=1 ; i<basicNumber.length;i++){
			for(int j=0;j<i;j++){
				if(basicNumber[i] < basicNumber[j]){
					swapArrayByIndex(j,i);
				}
			}
			printArray(basicNumber);

		}
	}

}
