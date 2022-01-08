package com.company;

public class EqualisNot {
    public static boolean equalIsNot(String str)
    {
        int is = 0, not = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.substring(i).startsWith("is"))
            {
                is++;
            }
            if(str.substring(i).startsWith("not"))
            {
                not++;
            }
        }
        return (is == not);
    }
}
//   str.substring(2)