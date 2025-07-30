import java.util.Scanner;

public class while_loop {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String response="";

        while(!response.equals("Q")){
            System.out.print("You are playing a game ");
            System.out.print("Press Q to quit: ");
            response =scanner.next().toUpperCase();
        }
    }







}
