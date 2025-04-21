package com.pluralsight;

public class Dice {
        //create roll method return an int
        public int roll() {
            int randomNumber =  (int) (Math.random() * 6) + 1;
            return randomNumber;
        }

}
