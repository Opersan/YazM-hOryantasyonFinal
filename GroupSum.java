package com.company;

public class GroupSum
{
    public static  boolean groupSum(int start, int[] nums, int target)
    {
        if(target == 0) return true;
        if(target < 0) return false;
        if(start >= nums.length) return false;
        return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
    }
}
// target = 10
// groupSum(1, nums, 8) || groupSum(1, nums, 10)





//groupSum(2, nums, 4) groupSum(2, nums, 8)     groupSum(2, nums 6)     groupSum(2, nums, 10)