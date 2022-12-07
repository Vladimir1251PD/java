package src.ru.mirea.task2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Card {
    private String[] suits = new String[] {
            "Diamonds", "Hearts", "Clubs", "Spades"
    };
    private String[] ranks = new String[] {
            "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"
    };
    private int suit;
    private int rank;
    Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }
    @Override
    public String toString() {
        return (ranks[rank] + " of " + suits[suit]);
    }
}
class Deck {
    private ArrayList<Card> cards;

    Deck() {
        cards = new ArrayList<Card>();
        int index_1, index_2;
        Random generator = new Random();
        Card temp;

        for (int a = 0; a <= 3; a++) {
            for (int b = 0; b <= 12; b++) {
                cards.add(new Card(a, b));
            }
        }

        int size = cards.size() -1;

        for (int i = 0; i < 100; i++) {
            index_1 = generator.nextInt(size);
            index_2 = generator.nextInt(size);

            temp = (Card) cards.get(index_2);
            cards.set(index_2, cards.get(index_1));
            cards.set(index_1, temp);
        }
    }

    public Card deleteFromDeck() {
        return cards.remove(cards.size()-1);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}


class Hand {
    private Card[] cards;

    Hand(Deck d) {
        cards = new Card[5];
        for (int x = 0; x < 5; x++) {
            cards[x] = d.deleteFromDeck();
        }
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }
}

public class Poker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Deck deck = new Deck();

        for (int i = 0; i < n; i++) {
            Hand hand = new Hand(deck);
            System.out.println(hand.toString());
        }
    }
}
