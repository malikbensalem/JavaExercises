package com.qa.armstrong;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        System.out.println(armstrong(1000));
    }

    public static List<Integer> armstrong(int max){

        List<Integer> nums = new ArrayList<>();
        for (int i = 0,temp=i,iNum=0 ; i <= max ; i++,temp=i,iNum=0) {
            while (temp > 0) {
                iNum += Math.pow((temp%10),String.valueOf(i).length());
                temp /=10;
            }
            if (iNum == i) {
                nums.add(i);
            }
        }
        return nums;
    }
}
