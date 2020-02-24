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
    Scanner reader = new Scanner(System.in);
    
    randomNumber = rnd.nextInt(6) + 1;
    
    System.out.println("A dice is rolled. What number does it land on?");
    while (true) {
      try {
        userGuess = reader.nextInt();
        if (userGuess == randomNumber) {
          System.out.println("That's right!");
          System.out.println("You got it in " + guessesMade + " roll/s.");
          break;
          
        } else {
          System.out.println("Try again!");
          guessesMade = guessesMade + 1;
          
        }
        
      } catch (NumberFormatException nfe) {
        System.err.println("Please enter a value between (1-6)");
        
      }
      
    }
    
  }
  
}