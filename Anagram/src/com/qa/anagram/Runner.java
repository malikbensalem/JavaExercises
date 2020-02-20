package com.qa.anagram;

public class Runner {
    public static void main(String[] args) {
        System.out.println(anagram("abbb", "baaa"));
        System.out.println(anagram("abc","bca"));
    }

    public static boolean anagram(String a, String b) {
        a.replace(" ","").toLowerCase();
        b.replace(" ","").toLowerCase();
        if (a.length() == b.length()) {
            for (;a.length() > 0;) {
                if (b.contains(String.valueOf(a.charAt(0)))) {
                    a = new StringBuilder(a).deleteCharAt(0).toString();
                    b = new StringBuilder(b).deleteCharAt(b.indexOf(a.charAt(0))).toString();
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
