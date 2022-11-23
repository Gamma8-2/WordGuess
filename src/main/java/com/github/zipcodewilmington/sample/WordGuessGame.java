package com.github.zipcodewilmington.sample;

import java.util.Random;
import java.util.Scanner;

public class WordGuessGame {

    String[] dictionary_list = {"ant", "bat", "cat", "dad", "egg", "fan", "gem", "hen", "ink", "jug", "kid", "log", "men", "nun", "owl", "put", "qis", "rat", "sun", "tan", "urn", "van", "web", "xen", "yak", "zoo"};
    String random_word;
    String guess_word;
    int random_number;
    boolean win = false;
    Random random = new Random();


    public void run() {
        String inputDecision = "Y";

        do {

            boolean gameStatus = false;
            win = false;
          //  int balance = _wordGuessPlayer.get_wordGuessPlayerBalance();
           // _wordGuessPlayer.set_wordGuessPlayerBalance(balance - 1);
          //  balance = _wordGuessPlayer.get_wordGuessPlayerBalance();
            random_word = dictionary_list[(int) (Math.random() * dictionary_list.length)];
            random_number = random.nextInt(3);

            if (random_number == 0) {
                System.out.println("please guess a three letter word your hint : " + random_word.charAt(0) + " _ " + " _ ");

            } else if (random_number == 1) {
                System.out.println("please guess a three letter word your hint : " + " _ " + random_word.charAt(1) + " _");

            } else
                System.out.println("please guess a three letter word your hint : " + " _ " + " _ " + random_word.charAt(2));

            //guess_word = console.getStringInput("please guess a three letter word your hint : " + random_word.charAt(0));

            gameStatus = wordEngine(guess_word,random_word);

            if (gameStatus && win) {
                //_wordGuessPlayer.set_wordGuessPlayerBalance(balance + 10);
               // int total = _wordGuessPlayer.get_wordGuessPlayerBalance();
                System.out.println(" Congratulations  you got it ");
            }

            System.out.println ("Do you want to continue Y/N ?");



        } while (inputDecision.equals("Y"));
    }

    public boolean wordEngine(String guessword, String ranword) {
        if (ranword.equals(guessword)) {
            win = true;
            return true;
        } else {
            System.out.println(" better luck next time   and Secret word is " + ranword);
        }
        return false;
    }

}
