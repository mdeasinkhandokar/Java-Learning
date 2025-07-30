import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class do_while_loop {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
/*
        int age = 0;
        do {
            System.out.println("Your age can't be negative");
            System.out.println("Enter your age : ");
            age = scanner.nextInt();

        }
        while (age < 0);

            System.out.println("You are " + age + " years old ");


*/
        int num = 0;
        do {
            System.out.println("Enter a number between 1-10 :");
            num = scanner.nextInt();
        }
        while (num < 1 || num > 10);
        System.out.println("You picked " + num);


    }





}
