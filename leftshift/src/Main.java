import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        /// Rule of LS

        Scanner scanner= new Scanner(System.in);


        /*
        x << n  ==  x * (2^n)
        3 << 1 = 3 * 2 = 6

        3 << 2 = 3 * 4 = 12

        7 << 3 = 7 * 8 = 56
         */

        /*
        int x;
        int n;
        System.out.print("Enter the  x and n :");
        x=scanner.nextInt();
        n=scanner.nextInt();

       int result= x<<n;

        System.out.println(x +"<<"+n  +":" + result);
        */


        byte a =64, b;
        int i;
        i= a<<2;
        b=(byte) (a<<2);

        System.out.println("original value of a :" +a);
        System.out.println("i and b :" + i + " " +b);










        scanner.close();

    }



}
