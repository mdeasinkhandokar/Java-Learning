import java.util.Scanner;

public class nested_for_loop {
    public static void main(String [] args){
        /// nested loop = A loop inside another loop
        ///              used often with matrices or DSA
/*
        for(int i=1;i<=3;i++){
            for(int j=1;j<=9;j++){
                System.out.print(i + " ");

            }
            System.out.println();
        }

 */

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows :");
        rows=scanner.nextInt();

        System.out.print("Enter the # of colums : ");
        columns=scanner.nextInt();


        System.out.print("Entet the symbol of use :");
        symbol= scanner.next().charAt(0);
for(int j=0;j<rows;j++) {
    for (int i = 0; i < columns; i++) {
        System.out.print(symbol);
    }
    System.out.println();
}
        scanner.close();


    }
}
