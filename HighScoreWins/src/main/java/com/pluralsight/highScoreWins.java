package com.pluralsight;

import java.util.Scanner;


public class highScoreWins {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please input game score.\nFormat (HomeName:VisitorName|HomeScore:VisitorScore): ");
        String score = scanner.nextLine();

        String[] token = score.split("[|:]");
        //convert the string into number
        int homeScore = Integer.parseInt(token[2]);
        int visitorScore = Integer.parseInt(token[3]);


        //this does the comparting and printing for me after I turned those index from String to int
        if(homeScore == visitorScore) {
            System.out.println("Game is a TIE!");
        }
        // a more efficient way of writing the code below using ternary operator, without repeating/ using else if
        else{
            String winner = homeScore > visitorScore ? token[0]:token[1];
            System.out.printf("Winner: %s",winner);
        }


//        else if(homeScore > visitorScore){
//            System.out.printf("Winner: %s", token[0]);
//        }else{
//            System.out.printf("Winner: %s", token[1]);
//        }



    }
}
