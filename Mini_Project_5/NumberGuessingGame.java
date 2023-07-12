package project_mini_2;

import java.util.Scanner;

public class NumberGuessingGame {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int numberToGuess = (int)(Math.random()*100); 
    int numTries = 0;
    int guess;
    
    while(true) {
      System.out.print("Guess the number between 0 to 100: ");
      guess = scanner.nextInt();
      numTries++;
      
      if(guess == numberToGuess) {
        System.out.println("You guessed the number! It took you " + numTries + " tries.");
        break;
      }
      if(numTries==10){
       System.out.println("You have exceeded the limit of " + numTries + " tries."+ " Please try again! ");
       break; 
      }
      else if(guess < numberToGuess) {
        System.out.println("Too low, try again!");
      }
      else {
        System.out.println("Too high, try again!");
      }
    }
    
    scanner.close();
  }

}