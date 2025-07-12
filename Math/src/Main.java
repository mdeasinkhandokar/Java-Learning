import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{


    public static void main(String[] args){

        System.out.println(Math.PI);
        System.out.println(Math.E);//Exponent


        double result;
        double result1;
        double result2;
        double result3;
        double result4;
        double result5;
        double result6;


        result1=Math.pow(2,5);
        result=Math.abs(-5);
        result2=Math.sqrt(9);
        result3=Math.round(3.14);
        result4=Math.ceil(4.12);
        result5=Math.floor(3.99);
        result6=Math.max(10,20);

        System.out.println(result1);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);


        /// Hypotenuse c =Math.sqrt(a^2 +b^2)
        System.out.println(" Hypotenuse c =Math.sqrt(a^2 +b^2)");
        Scanner scanner = new Scanner(System.in);


        double a;
        double b;
        double c;


        System.out.println("Enter the length of side A: ");
        a=scanner.nextDouble();

        System.out.println("Enter the length of side B:");
        b=scanner.nextDouble();

        c=Math.sqrt(Math.pow(a,2) +Math.pow(b,2));

        System.out.println("The hypotenuse (side c) c: "+c);





        scanner.close();



    }

}
