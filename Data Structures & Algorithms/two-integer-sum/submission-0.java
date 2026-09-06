class Solution {

    // nums = [3, 4, 5, 6]
 // numbers = [(3, 0) , (4, 1), (5, 2) , (6, 3) ]

    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> numbers = new HashMap<>();
        int complement;
        for(int i =0; i < nums.length; i++){
            complement = target - nums[i];
            if(numbers.containsKey(complement)){
                return new int[] {numbers.get(complement) , i};
            } else{
                numbers.put(nums[i] , i);
            }
        }

        return new int[]{};
    }
}
