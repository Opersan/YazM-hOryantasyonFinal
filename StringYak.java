package com.company;

public class StringYak {
    public static String stringYak(String str)
    {
        String str1 = "";
        if(str.length() < 3) return str;
        for(int i = 0; i < str.length() ; i++)
        {
            if(i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k')
            {
                i += 2;
            }
            else str1 += str.charAt(i);
        }
        return str1;
    }// index out of bounds exp

}
