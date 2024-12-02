package Array;

public class MajorityElement {
    
}


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int e:nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/3)list.add(key);
        }
        return list;
    }
}

