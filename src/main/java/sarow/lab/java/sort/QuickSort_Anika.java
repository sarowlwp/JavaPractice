package sarow.lab.java.sort;


public class QuickSort_Anika {
	public int[] array={1,6,5,8,0,93,7,13,11,9,7,0,11,45,67,90,100,111,32,46,78,1,1,1,1,9,9,9,9,1,2,41,1,1,23,9};
	public void QuickSort(int start,int end){
		int position=start;
		for(int i=position;i<end;i++){
			if(array[position]>array[i+1]){
				int temp=array[i+1];
				for(int j=i+1;j>position;j--){
					array[j]=array[j-1];
				}
				array[position]=temp;
				position+=1;
			}	
		}
		if(start<position-1){
		QuickSort(start, position-1);
		}
		if(end>position+1){
		QuickSort(position+1, end);
		}
		
	}
	public void printarray(int[] a){
		for(int i :a ){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		QuickSort_Anika a = new QuickSort_Anika();
		a.QuickSort(0, a.array.length-1);
		a.printarray(a.array);
	}
}
