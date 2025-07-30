import java.util.Scanner;



public class Main {

    public static void main(String [] args ) {

        Scanner scanner = new Scanner(System.in);

        /// username must be between 4-12 characters
        /// username must not contain spaces or underscores

        String username;
        username = scanner.nextLine();

        System.out.println();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 character");

        } else if (username.contains(" ") || username.contains("-")) {
        System.out.println("Username must not contain spaces or underscores ");
    }
       else{
            System.out.println("Welcome " + username);
        }





    }






}
