package com.qa.chickrabs;

public class Runner {
    public static void main(String[] args){
        chickRab(99,24);
        chickRab(10,24);
    }public static void chickRab(int h,int l){
        int c=2*h-l/2;
        if (c>0&&h-c>0) {
            System.out.println("Chickens:"+c+"\nRabbits:"+(h-c));
            return;
        }
        System.out.println("not correct values");
    }
}

