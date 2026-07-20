// ASCENDING
class Solution {
    public void bubbleSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){ 
            // Checking j with j+1
            for(int j=0;j<n-i-1;j++){
                // At the end of this loop the largest element is moved to the end. So we do not need to disturb that element
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
// DESCENDING
class Solution {
    public void bubbleSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
