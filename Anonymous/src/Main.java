public class Main {

    /// Anonymous class = A class that desn't have a name. Cannot be resued.
     ///                 Add custom behavior without having to create a new class.
    ///                  Often used for one time uses (TimerTask, Runnable, callbacks)
public static void main(String [] args) {

    Dog dog = new Dog();
    Dog dog2= new Dog(){

    @Override
    void speak() {
        System.out.println("Scooby Doo says *Ruh Roh* ");
    }
    };

    dog.speak();
    dog2.speak();

}

}
