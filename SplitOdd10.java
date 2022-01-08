package com.company;

public class SplitOdd10 {

    public static boolean splitOdd10(int[] nums)
    {
        if(nums.length == 0) return false;
        if(nums.length == 1) return true;
        return oddOr10(0, nums, 0, 0);
    }
    public static boolean oddOr10(int start, int[] nums, int sum1, int sum2)
    {
        if(start >= nums.length) return sum1 % 10 == 0 && sum2 % 2 != 0;
        return oddOr10(start + 1, nums, sum1 + nums[start], sum2) || oddOr10(start + 1, nums, sum1, sum2 + nums[start]);
    }
}




// oddOr10(1, nums, 5, 0) || oddOr10(1, nums, 0, 5)




//oddOr10(2,nums, 10, 0) || oddOr10(2,nums,5,5)