class Solution {
    public void insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
// Start from 1 since we are moving sorted to left
// Move until it reaches end and that arr[j] is always greater than the key
// Insert into j+1 because j go one more than the correct position to fail
