package Array;

class Solution {
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    void nextPermutation(int[] arr) {
        // code here
        //1.find the index which are smaller than its adjacent element; traversing from RtoL
        int n=arr.length;
        int index=-1;
        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                index=i-1;
                break;
            }
        }
        //2.fiind the swap index which value are greater than index value;
        //traversing from RtoL
        if(index!=-1){
            int swap_index=index;
            for(int i=n-1;i>index;i--){
                if(arr[i]>arr[index]){
                    swap_index=i;
                    break;
                }
            }
            //3.swap(arr[index],arr[swap_index])
            int temp=arr[index];
            arr[index]=arr[swap_index];
            arr[swap_index]=temp;
        }
        reverse(arr,index+1,n-1);
    }
}
