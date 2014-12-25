package sarow.lab.java.sort;


public class MergeSort_Anika {
	
	public int[] array={1,6,5,8,0,93,7,13,11,9,7,0,11,45,67,90,100,111,32,46,78,1,1,1,1,9,9,9,9,1,2,41,1,1,23,9};
	
	public int[] MergeSort(int[] arrays){
		//如果数组长度为1，则不需要拆分，结束递归
		if(arrays.length == 1){
			return arrays;
		}
		//获取数组的中间位置
		int mid_position = arrays.length/2;
		int[]leftarray=new int[mid_position];
		for(int i=0;i<mid_position;i++){
			leftarray[i]=arrays[i];
		}
		int[]rightarray=new int[arrays.length-mid_position];
		for(int i=0;i<rightarray.length;i++){
			rightarray[i]=arrays[mid_position+i];
		}
		return merge(MergeSort(leftarray), MergeSort(rightarray));
	}
	
	public int[] merge(int[]left,int []right){
		int[] mergearray=new int[left.length+right.length];
		int left_cur = 0;
		int right_cur = 0;
		for(int i = 0; i <left.length + right.length;i++){
			if(left_cur == left.length){
				mergearray[i] = right[right_cur];
				right_cur ++;
			}else if(right_cur == right.length){
				mergearray[i] = left[left_cur];
				left_cur ++;
			}else if(left[left_cur] > right[right_cur]){
				mergearray[i] = right[right_cur];
				right_cur ++;
			}else{
				mergearray[i] = left[left_cur];
				left_cur ++;
			}
			
		}
		printarray(mergearray);
		return mergearray;
	}
	
	public void printarray(int[] a){
		for(int i :a ){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		MergeSort_Anika a = new MergeSort_Anika();
		int[]array=a.MergeSort(a.array);
		a.printarray(array);
	}
	
	
}
