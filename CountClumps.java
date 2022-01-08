package com.company;

public class CountClumps {

    public static int countClumps(int[] nums)
    {
        boolean flag = true;
        int count = 0;
        for (int i = 0; i < nums.length -1; i++)
        {
            if (nums[i] == nums[i + 1] && flag)
            {
                flag = false;
                count++;
            }
            else if (nums[i] != nums[i + 1]) flag = true;
        }
        return count;
    }
    // flag = false count = 1
}
