package com.company;

public class Fix34
{
    public static int[] fix34(int[] nums)
    {
        int hold = 0, index = 0, a = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 3)
            {
                for(; a < nums.length; a++)
                {
                    if(nums[a] == 4)
                    {
                        hold = nums[i + 1];
                        nums[i + 1] = nums[a];
                        nums[a] = hold;

                        break;
                    }
                }// a = 3
            }
        }
        return nums;
    }
}
