package com.company;

public class EndX
{
    public static String endX(String str)
    {
        if(str.length() == 0) return "";
        if(str.length() == 1) return str;
        if(str.charAt(0) == 'x') return endX(str.substring(1)) + "x";
        return str.charAt(0) + endX(str.substring(1));
    }
} // xxre endx("xre") + "x"
 // endX("re") + "x" + "x"
 // r + endX("e") + "x" + "x"
 // r + e + x + x rexx

