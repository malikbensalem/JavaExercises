package com.qa.letter;

public class Runner {
    public static void main(String args[]) {
        letterCounter("hellloooo");
    }

    public static void letterCounter(String sen) {
        int[] arr = new int[25];
        for (char l:sen.toLowerCase().toCharArray()){//each letter in string
            if (l>96 &&l<123){//if its a letter
                arr[l-97]+=1;//+1 to counter
            }
        }for (int i=0;i<arr.length;i++){//this prints "[letter] : [occurrences]"
            System.out.println((char) (i+97)+": "+arr[i]);
        }
    }

}

