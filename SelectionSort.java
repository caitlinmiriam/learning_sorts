// ASCENDING
class Solution {
    void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
// DESCDENDING
class Solution {
    void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int maxIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
    }
}
