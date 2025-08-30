import java.util.Scanner;

/// Dynamic Polymorphism

public class Main {

    /// Runtime Polymorphism= when the method that gets executed is decided
    ///                      at runtime  based on the actual type of the object

 public static void main(String[] args){

     Scanner scanner = new Scanner(System.in);

Animal animal;

     System.out.println("would you like a dog or a cat ?(1=dog,2.=cat ):");
     int choice =scanner.nextInt();

     if(choice == 1){
         animal = new Dog();
         animal.speak();
     }
     else if(choice==2){
         animal= new Cat();
         animal.speak();
     }

 }

}
