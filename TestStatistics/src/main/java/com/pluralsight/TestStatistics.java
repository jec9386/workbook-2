package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        //create array for 10 test scores
        int[] scores = {63, 70, 77, 80, 100, 90, 95, 81};
        int average;
        int total = 0;
        int highScore = scores[0];
        int lowScore = scores[0];


        //just testing out a different way to write this code using min max and for loop
        for (int score = 0; score < scores.length; score++ ){
            total += scores[score];//add up total

            if(scores[score] > highScore){
                highScore = scores[score];//replace highScore if the current index it is iterating through is bigger value
            }
            if(scores[score] < lowScore){
                lowScore = scores[score];//replace lowScore if the current index it is iterating through is smaller value
            }
        }

        average = total / scores.length;

        System.out.printf("The average score is: %d\n", average);
        System.out.printf("The high score is: %d\n", highScore);
        System.out.printf("The low score is: %d", lowScore);








//        Way professor and I did it using an enhanced for loop or (for each loop)
//        int highScore = 0;
//        int lowScore = 100;
//        int total = 0;
//
//        for (int score : scores){
//            total += score;
//            if (score > highScore){
//                highScore = score;
//            }
//            if (score < lowScore){
//                lowScore = score;
//            }
//        }
//
//        average = total / scores.length;
//        System.out.printf("The average score is: %.2f\n", average);
//        System.out.printf("The high score is: %d\n", highScore);
//        System.out.printf("The low score is: %d", lowScore);




    }


}
