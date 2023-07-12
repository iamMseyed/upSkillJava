package project_mini_1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    
    while (true) {
      
      System.out.print("Type any of the following choices (rock, paper, scissors): ");
      String userMove = scanner.nextLine();
      
      int systemMove = rand.nextInt(3);
      
      if (systemMove == 0) {
        System.out.println("Computer chose Rock");
      } else if (systemMove == 1) {  
        System.out.println("Computer chose Paper");
      } else {
        System.out.println("Computer chose Scissors");
      }
      
      if (userMove.equals("rock") && systemMove == 2) {
        System.out.println("Player wins!");
      } else if (userMove.equals("paper") && systemMove == 0) {
        System.out.println("Player wins!");
      } else if (userMove.equals("scissors") && systemMove == 1) {
        System.out.println("Player wins!");
      } else if (userMove.equals("rock") && systemMove == 1) {
        System.out.println("Computer wins!");
      } else if (userMove.equals("paper") && systemMove == 2) {
        System.out.println("Computer wins!");
      } else if (userMove.equals("scissors") && systemMove == 0) {
        System.out.println("Computer wins!");
      } else {
        System.out.println("It's a tie!");
      }
      
    }
    
  }
  
}