package com.company;

public class SeriesUp {
    public static int[] seriesUp(int n)
    {
        int[] arr = new int[n * (n + 1) / 2];
        int index = 0;
        int z = 1;
        for(int i = 0; i < n; i++)
        {
            for(int a = 1; a <= z; a++)
            {
                arr[index] = a;
                index++;
            }
            z++;
        }
        return arr;
    }

}// n = 4 z = 2 arr = 1 1 2 1 2 3 1 2 3 4
