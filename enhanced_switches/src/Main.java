import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        /// Enhanced Switch = A replacement to many else if statements
        /// (jaa14 feature)

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the day of the week");

        String day=scanner.nextLine();


//        String day ="bye";
/*
        if(day.equals("Monday")){
            System.out.println("It is workday");
        } else if (day.equals("Friday")) {
            System.out.println("It is hoilday");
        }else if(day.equals("Thursday")){
            System.out.println("The next day hoilday");
        }
        else{
            System.out.println("Relax");
        }
 */

        switch (day){
            case "Monday" ->System.out.println("It is workday");
            case "Tuesday"->System.out.println("It is workday");
            case "Thursday" -> System.out.println("The next day hoilday");
            case"Friday" ->System.out.println("It is hoilday");
            default -> System.out.println(day +" is not a day");
        }







    }





}
