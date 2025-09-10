import java.util.Scanner;

public class Main {

    public static void main (String [] args){


        Scanner scanner = new Scanner(System.in);


        int a;
        a=scanner.nextInt();
        int b;
        b= scanner.nextInt();
        int c;
        c=scanner.nextInt();




        int marks =(a+b+c)/3;
//        marks=scanner.nextInt();

        if(marks >= 90){
            System.out.println("You get A+");
        }
        else if( marks>=80){
            System.out.println("You get B+");
        }
        else{
            System.out.println("Failed");
        }

    }
}
