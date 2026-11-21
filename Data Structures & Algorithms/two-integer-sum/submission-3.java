class Solution {
    public int[] twoSum(int[] nums, int target) {
       //taking hashmap as input
        HashMap<Integer,Integer> indices =new HashMap<>();
         //storing the value and position of the array numbers in hashmap
        for(int i=0;i< nums.length;i++){
            indices.put(nums[i],i);
        }
        //finding the numbers == target
        for(int i=0;i<nums.length;i++){
            int diff= target-nums[i];
            if(indices.containsKey(diff) && indices.get(diff)!=i){
                return new int[]{i,indices.get(diff)};
            }
        }
        return new int[0];
    }
}
