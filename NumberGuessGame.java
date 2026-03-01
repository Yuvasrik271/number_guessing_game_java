import java.util.Random;
import java.util.Scanner;
public class NumberGuessGame{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random ran = new Random();
        int secretnumber = ran.nextInt(100)+1;
        int attempts = 0;

        System.out.println("=================================");
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        System.out.println("=================================");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have 5 attempts");

        while(attempts < 5){
              System.out.println("Enter your guess: ");
              int guess = sc.nextInt();
              attempts++;

              if(guess == secretnumber)
              {
                System.out.println("Congratulations!!");
                System.out.println("You guessed in "+attempts+" attempts!");
                break;
              }
              else if(guess < secretnumber)
              {
                System.out.println("Too low! Try a bigger number");
              }
              else 
              {
              System.out.println("Too high! Try a smaller number");;
              }
            }

              if(attempts==5){
                System.out.println("/n Game Over!");
                System.out.println("The correct number was "+secretnumber);
              }
                System.out.println("=================================");
                System.out.println("Thanks for playing");
                System.out.println("=================================");
             sc.close(); 
        }
    }




