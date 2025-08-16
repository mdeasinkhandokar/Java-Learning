import java.util.Scanner;

/// Search an array



public class main {

public static void main(String[] args){
    int[] numbers = {1,9,2,8,3,5,4};
    String[] fruits={"apple", "banana", "orange"};
//    String target ="orange";
//    int target=43;
    boolean isFound =false;
    String target;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a fruit to search for : ");
    target =scanner.nextLine();


    for(int i=0;i<fruits.length;i++){
//        if(target == furits[i]){
        if(fruits[i].equals(target)){
            System.out.println("Element found at index : "+ i);
            isFound= true;
            break;
        }
    }
if(!isFound){
    System.out.println("Element not found in the array  ");
}

}
}
