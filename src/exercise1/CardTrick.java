package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @Rathnayake Rathnayake
 *  May 23, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int) (Math.random() * 13) + 1);
            int randomNumber = (int) (Math.random() * 4);
            card.setSuit(Card.SUITS[randomNumber]);
            hand[i] = card;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the card value (1 for Ace, 11 for Jack, 12 for Queen, 13 for King): ");
        int userValue = scanner.nextInt();
        System.out.print("What is the suit (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs): ");
        int userSuit = scanner.nextInt();
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit - 1]);

        boolean foundMatch = false;

        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == userCard.getValue() && hand[i].getSuit().equals(userCard.getSuit())) {
                foundMatch = true;
                break;
            }
        }

        if (foundMatch) {
            printInfo();
        } else {
            System.out.println("No match found.");
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to
     * replace this information with your own.
     *
     * author Rathnayake Rathnayake May 23 2023
     */
    private static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Susath");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Get a job in Software Development");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Listening to music");
        System.out.println("-- Gaming");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my car");

        System.out.println();

    }

}