import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        boolean isStudent;

        System.out.println("Enter your name :");
        name= scanner.nextLine();



        System.out.println("Enter your age");
        age= scanner.nextInt();

        System.out.println("Are you student  (true/false): ");
        isStudent = scanner.nextBoolean();

        if(name.isEmpty()){
            System.out.println("you didn't enter your name!");
        }
        else{
            System.out.println("hello "+ name + "!");

        }


        if(age>=65){
            System.out.println("You are a senior");

        }
        else if(age>=18){
            System.out.println("you are adult!");
        }
        else if(age<0){
            System.out.println("You haven't been born yet!");

        }
        else{
            System.out.println("you are a baby!");
        }

        if (isStudent){
            System.out.println("you are a student");
        }
        else{
            System.out.println("you are not a student");
        }
    }

}
