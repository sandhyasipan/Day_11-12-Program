package com.bridgelab;

public class DeckofCard {
    static final int numOfPlayers = 4;
    static final int numOfDistCards = 9;

    public static void main(String[] args) {
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int n = SUITS.length * RANKS.length;
        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }


        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));

            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }


        int a = 0;
        String[][] distributeCards = new String[numOfPlayers][numOfDistCards];
        for (int i = 0; i < numOfPlayers; i++) {
            for(int j = 0; j < numOfDistCards; j++) {
                distributeCards[i][j] = deck[a];
                a++;
            }
        }

        for (int i = 0; i < numOfPlayers; i++) {
            for(int j = 0; j < numOfDistCards; j++) {
                System.out.println(distributeCards[i][j]);
            }
            System.out.println(" ");
        }

    }
}

