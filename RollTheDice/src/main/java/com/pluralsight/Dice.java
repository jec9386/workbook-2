package com.pluralsight;

public class Dice {
        public int roll() {
            return (int) (Math.random() * maxValue) + minValue;
        }

}
