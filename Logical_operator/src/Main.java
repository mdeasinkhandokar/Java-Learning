import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        //&&= AND
        // || = OR
        // ! = NOT
Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the temperature :");
            double temp;
            temp=scanner.nextInt();
        System.out.print("Enter the isSunny :");
            boolean isSunny;
            isSunny=scanner.nextBoolean();

            if(temp <=30 && temp>=0 && isSunny){
                System.out.println("The weather is good");
                System.out.println("It is Sunny outside");

            }
            else if(temp <=30 && temp>=0 && !isSunny){
                System.out.println("The weather is Good");
                System.out.println("It is Cloudy outside");
            }
            else if(temp>30 || temp<0){
                System.out.println("The weather is bad");
            }



            Scanner close;

    }
}
