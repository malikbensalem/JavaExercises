package com.qa.fizz;

public class Runner {
    public static void main(String [] args){

    }
    public static String fizz(int n){
        String w="";
        if (n%3==0){
            w="fizz";
        }if (n%5==0){
            w+="buzz";
        }if (n%7==0){
            w+="pop";
        }if (n%11==0){
            w+="snap";
        }if (w.equals("")){
            return String.valueOf(n);
        }return w;

    }
}
