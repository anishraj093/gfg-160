package Array;
//Second Largest in arr


class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        //find the max element
        int max=0;
        for(int e:arr){
            if(e>max)max=e;
        }
        int secondMax=-1;
        for(int e:arr){
            if(e>secondMax&&e!=max)secondMax=e;
        }
        return secondMax;
    }
}