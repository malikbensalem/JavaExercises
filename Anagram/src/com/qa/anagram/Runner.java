package com.qa.anagram;

public class Runner {
    public static void main(String[] args) {
        System.out.println(anagram("abbb", "baaa"));
        System.out.println(anagram("abc","bca"));
    }

    public static boolean anagram(String a, String b) {
        if (a.length() == b.length()) {
            for (;a.length() > 0;) {
                if (b.contains(String.valueOf(a.charAt(0)))) {
                    int bb=b.indexOf(a.charAt(0));
                    a = new StringBuilder(a).deleteCharAt(0).toString();
                    b = new StringBuilder(b).deleteCharAt(bb).toString();

                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
