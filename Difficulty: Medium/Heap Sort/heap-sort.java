class Solution {
    // Function to sort an array using Heap Sort.
    void heapify(int arr[], int n, int i){
        int l = 2*i+1;
        int r = 2*i+2;
        int max = i;
        if(l<n && arr[l]>arr[max]){
            max = l;
        }
        if(r<n && arr[r]>arr[max]){
            max = r;
        }
        if(max == i) return;
        int t = arr[i];
        arr[i] = arr[max];
        arr[max] = t;
        heapify(arr,n,max);
    }
    public void heapSort(int arr[]) {
        // code here
        int n = arr.length;
        for(int i = n/2; i>=0; i--){
            heapify(arr,n,i);
        }
        for(int i = n-1; i>=0; i--){
            int t = arr[i];
            arr[i] = arr[0];
            arr[0] = t;
            heapify(arr,i,0);
        }
    }
}