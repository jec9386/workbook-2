package com.pluralsight;

public class ForLoop {
    public static void main(String[] args){
        //for loop initialize; condition you want number to reach 0 "launch"; remove by 1 per loop so it can reach 0
        for (int i = 10; i >= 0; i-- ){
           //if so it doesnt print 0 and will print Launch instead.
            if(i == 0){
                System.out.println("Launch!");
            } else {
                System.out.println(i);
            }
        }
    }
}
