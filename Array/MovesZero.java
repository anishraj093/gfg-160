package Array;
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        // fill the first i_th index with non-zero element
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]>0)arr[i++]=arr[j];
        }
        //fill the remaning position with zero
        while(i<n){
            arr[i++]=0;
        }
    }
}
