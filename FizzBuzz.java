package com.company;

public class FizzBuzz {

    public static String[] fizzBuzz(int start, int end)
    {
        String[] fb = new String[end - start];
        int index = 0;
        for(int i = start; i < end; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                fb[index] = "FizzBuzz";
                index++;
            }
            else if(i % 3 == 0)
            {
                fb[index] = "Fizz";
                index++;
            }
            else if(i % 5 == 0)
            {
                fb[index] = "Buzz";
                index++;
            }
            else
            {
                fb[index] = String.valueOf(i);
                index++;
            }
        }
        return fb;
    }
}
