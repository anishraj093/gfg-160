package Array;
public class kadanes_algorithm {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int currSum=0;
        int maxSum=0;
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            currSum=Math.max(currSum+arr[i],0);
            maxSum=Math.max(maxSum,currSum);
            max=Math.max(max,arr[i]);
        }
        if(maxSum==0)return max;
        return maxSum;
    }
}
