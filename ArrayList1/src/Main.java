import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        ArrayList<String> foods= new ArrayList<>();

        System.out.println("Enter the # of food you would like :");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();


        for(int i=1;i<=numOfFood;i++){
            System.out.println("Enter food # "+i+ ": ");
            String food = scanner.nextLine();
            foods.add(food);

        }

        System.out.println(foods);

        scanner.close();


    }






}
