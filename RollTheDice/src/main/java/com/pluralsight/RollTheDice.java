package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args){
        //create instance of dice

        Dice dice = new Dice();

        int roll1;
        int roll2;
        int numOf2 = 0;
        int numOf4 = 0;
        int numOf6 = 0;
        int numOf7 = 0;

        for(int rollNumber = 1; rollNumber <= 100; rollNumber++ ){
            roll1 = dice.roll();
            roll2 = dice.roll();
            int rollTotal = roll1 + roll2;
            System.out.printf("Roll #%d: %d - %d Sum: %d\n",rollNumber, roll1, roll2,rollTotal);

            if(rollTotal == 2){numOf2++;}
            if(rollTotal == 4){numOf4++;}
            if(rollTotal == 6){numOf6++;}
            if(rollTotal == 7){numOf7++;}

            System.out.println("Total number of 2s: " + numOf2);
            System.out.println("Total number of 4s: " + numOf4);
            System.out.println("Total number of 6s: " + numOf6);
            System.out.println("Total number of 7s: " + numOf7);


        }
    }
}
