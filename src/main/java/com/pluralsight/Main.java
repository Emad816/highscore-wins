package com.pluralsight;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String userInput = "FCB:RMA|3:2";
        int difference;

        String[] states = userInput.split("\\|");
        //states = ["FCB:RMA", "3:0"]

        String[] teams = states[0].split("\\:");
        // teams =["FCB", "RMA"]

        String[] score = states[1].split("\\:");
        // score = ["3", "0"]

        int score1 = Integer.parseInt(score[0]);
        int score2 = Integer.parseInt(score[1]);

        if (score1 > score2){
            difference = score1 - score2;
            System.out.println("Winner: " + teams[0] + " by " + difference + " Goals");
        } else if (score2 > score1) {
            difference = score2 - score1;
            System.out.println("Winner: " + teams[1] + " by " + difference + " Goals");
        }else {
            System.out.println("Tie!");
        }


    }
}
