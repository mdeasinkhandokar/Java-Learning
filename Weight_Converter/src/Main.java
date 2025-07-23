import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /// Weight conversion program

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;



//        Declare variable
//        welcome message
//        prompt for useer choice

//        option 1 covert lbs to kgs

//        option 2 covert kgs to lbs

//        else print not a valid choice


        System.out.println("Weight Coversion Program");
        System.out.println("1 : Convert lbs to kgs");
        System.out.println("2 : Convert kgs to lbs");

        System.out.println("Choose an option : ");
        choice = scanner.nextInt();

        if(choice ==1){
            System.out.println("Enter the weight in lbs :");
            weight = scanner.nextDouble();
            newWeight= weight*0.453592;
            System.out.printf("The new weight in kgs id :  %.2f" , newWeight);



        }
        if(choice ==2) {
            System.out.println("Enter the weight in kgs :");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs id :  %.2f", newWeight);

        }
        else{
            System.out.println("That was not a valid choice");
        }

scanner.close();



        }
}
