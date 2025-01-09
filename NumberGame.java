import java.util.Random;
import java.util.Scanner;

  public class NumberGame{

    //Method to Guess
    public void guess(){
        Scanner sc = new Scanner(System.in);

        //Random Number generator
        Random number = new Random();
        int randomNumber = number.nextInt(100)+1;
        System.out.println("The Number Ranges from 1 - 100.");

        while(true){

        System.out.print("Guess the Number: ");
            int guessNumber = sc.nextInt();

            if(guessNumber==randomNumber){
                 System.out.println("Correct Guess! You Win");
                break;
                    }
                   else if(randomNumber > guessNumber){
                    System.out.println("The Number is Higher ");
                         }

                   else{
                    System.out.println("The Number is Too low");
                   }

                }
                System.out.println("Press the following");
                System.out.println("1.Play Again");
                System.out.println("2.Exit");
                int input = sc.nextInt();
                if(input==1)
                guess();
                else if(input==2)
                return;
            }
    public static void main(String args[]){
        NumberGame Game = new NumberGame();
             Game.guess();
             System.out.println("Thank You!!");
             System.out.println("Visit Again");
    }
}