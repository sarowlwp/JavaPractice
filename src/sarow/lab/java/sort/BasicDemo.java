package sarow.lab.java.sort;

public class BasicDemo {
	int[] basicNumber = {1,6,5,8,0,93,7,13,11,9,7,0,11,45,67,90,100,111,32,46,78,1,2,41,1,1,23,9};
	
	public void printArray(int[] array){
		StringBuilder sBuilder = new StringBuilder();
		for(int num : basicNumber){
			sBuilder.append(num);
			sBuilder.append(" , ");
		}
		System.out.println(sBuilder.toString());
	}
	
	public void swapArrayByIndex(int a,int b){
		int temp = basicNumber[a];
		basicNumber[a] = basicNumber[b];
		basicNumber[b] = temp;
	}
	
	
}
