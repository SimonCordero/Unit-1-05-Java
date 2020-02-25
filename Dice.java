import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Author: Simon Cordero.
 * Last updated: 2020/02/24.
 */
 
class Dice {
  
  public static void main(String[] args) throws IOException {
    int userGuess;
    int randomNumber;
    int guessesMade = 1;
    Random rnd = new Random();
    Scanner input = new Scanner(System.in);
    
    randomNumber = rnd.nextInt(6) + 1;
    
    System.out.println("A dice is rolled. What number does it land on?");
    try {
      userGuess = input.nextInt();
      while (userGuess != randomNumber) {
        System.out.println("Wrong answer!");
        userGuess = input.nextInt();
        guessesMade = guessesMade + 1;
      }
      System.out.println("----------------");
      System.out.println("That's correct!");
      System.out.println("You got it in " + guessesMade + " guesses.");
    } catch (Exception e) {
      System.err.println("Please enter a value between (1-6)");
    }
      
  }

}
  
