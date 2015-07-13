public class Solution {
    public int[] quickSort(int[] array) {
	// Write your solution here
	if( array == null )
	    return array;
	quickSort(array,0,array.length-1);
	return array;
    }
  
    public void quickSort(int[] array,int left,int right){
	if( left >= right ) return;
	int partitionIndex = partition(array,left,right);
	quickSort(array,left,partitionIndex-1);
	quickSort(array,partitionIndex+1,right);
    }
  
    public int partition(int[] array,int left,int right){
	int pivot = array[right];
	int leftBound = left;
	int rightBound = right-1;
	while( leftBound <= rightBound ){
	    if( array[leftBound] < pivot ){
		leftBound++;
	    }
	    else{
		swap(array,leftBound,rightBound--);
	    }
	}
	swap(array,leftBound,right);
	return leftBound;
    }
  
    public void swap(int[] array,int i,int j){
	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;
    }
}