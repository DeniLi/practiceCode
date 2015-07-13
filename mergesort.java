public class Solution {
    public int[] mergeSort(int[] array) {
	// Write your solution here.
	if( array == null || array.length == 0 )
	    return array;
      
	int[] helper = new int[array.length];
	mergeHelper(array,helper,0,array.length-1);
	return array;
    }
    public void mergeHelper(int[] array,int[] helper,int left,int right){
	if( left >= right ) return;
	int mid = left + (right-left)/2;
	mergeHelper(array,helper,left,mid);
	mergeHelper(array,helper,mid+1,right);
	merge(array,helper,left,mid,right);
    }
  
    public void merge(int[] array,int[] helper,int left,int mid,int right){
	for( int i = left; i <= right; i++ ){
	    helper[i] = array[i];
	}
	int leftIndex = left;
	int rightIndex = mid+1;
    
	while( leftIndex <= mid && rightIndex <= right ){
	    if( helper[leftIndex] < helper[rightIndex] ){
		array[left++] = helper[leftIndex++];
	    }
	    else{
		array[left++] = helper[rightIndex++];
	    }
	}
	while( leftIndex <= mid ){
	    array[left++] = helper[leftIndex++];
	}
    }
}