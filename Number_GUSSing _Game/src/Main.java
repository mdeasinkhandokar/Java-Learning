import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String [] args){

        /// Number guessing game

        Random random = new Random();
        Scanner scanner= new Scanner(System.in);

        int guess;
        int attempts=0;
        int min=1;
        int max=100;
//        int randomNumber=random.nextInt(min,max);
        int randomNumber=random.nextInt(min,max +1);

        System.out.println("Number Guessing Game");
//        System.out.println("Guess a number between 1-10 :");

        System.out.printf("Guess a number between %d-%d\n ", min,max)2;


        do {
            System.out.print("Enter a guess:  ");
            guess = scanner.nextInt();
            attempts++;


            if (guess < randomNumber) {
                System.out.println("Too LOW! Try again");
            } else if (guess > randomNumber) {
                System.out.println("Too HIGH! Try again");
            }
            else{
                System.out.println("Correct! The number was" +randomNumber );
                System.out.println("#of attempts :"+attempts);

            }


        }
        while(guess!=randomNumber);


        System.out.println("You have won");


   scanner.close();
    }
}
