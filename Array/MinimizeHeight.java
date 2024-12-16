package Array;

class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        //increase all the height by k or decrease all the height by k
        int ans=arr[n-1]-arr[0];
        //for all indices i increase arr[0-i-1] by k
        //decrease by arr[i-n-1] by k
        for(int i=1;i<n;i++){
            if(arr[i]-k<0)continue;
            int maxH=Math.max(arr[n-1]-k,arr[i-1]+k);
            int minH=Math.min(arr[0]+k,arr[i]-k);
            ans=Math.min(ans,maxH-minH);
        }
        return ans;
    }
}
