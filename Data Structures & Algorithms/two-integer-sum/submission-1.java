class Solution {

    // nums = [3, 4, 5, 6]. target = 7
 // numbers = [(3, 0) , (4, 1), (5, 2) , (6, 3) ]

    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> check = new HashMap<>();
        int complement;
        for(int i = 0; i < nums.length; i++){
            complement = target - nums[i];
            if(check.containsKey(complement)){
                return new int[]{check.get(complement) , i};
            } else {
                check.put(nums[i] , i);
            }
        }

        return new int[]{};
        
    }
}
