package org.example.Homework11;

import org.apache.commons.lang3.StringUtils;

public class Task4 {

    public static int getMultipl(int a, int b) {
        return a * b;
    }

    public static int getSub(int a, int b) {
        return a - b;
    }

    public static String getLowerCase(String a) {
        return StringUtils.lowerCase(a);
    }

    public static boolean getIsEmpty(String a) {
        return StringUtils.isEmpty(a);

    }

    public static String getTrim(String a) {
        return StringUtils.trim(a);
    }

    public static String getReverse(String a) {
        return StringUtils.reverse(a);
    }

    public static String getTruncate(String a, int w) {
        return StringUtils.truncate(a,w);
    }

    public static String getSubstring(String a, int w) {
        return StringUtils.substring(a,w);
    }

    public static String getReplace(String a, String b, String c) {
        return StringUtils.replace(a,b,c);
    }

    public static int getCountMatches(String a, String b) {
        return StringUtils.countMatches(a,b);
    }

    public static boolean getStartsWith(String a, String b) {
        return StringUtils.startsWith(a,b);
    }

}
