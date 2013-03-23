package com.sohu.suc.algorithm.sort;

import org.junit.Test;

public class BubbleSortDemo extends BasicDemo {
	
	/**
	 * swap
	 */
	@Test
	public void test(){
		//loop all
		for(int i=0 ; i<basicNumber.length;i++){
			for(int j=0;j<basicNumber.length-1;j++){
				if(basicNumber[j] > basicNumber[j+1]){
					swapArrayByIndex(j,j+1);
				}
			}
			printArray(basicNumber);
		}
	}

}
