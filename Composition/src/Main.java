public class Main  {

    public static void main(String [] args){
        /// composition = Represent a " part -of " relationship between objects.
        ///             for example, an Engine is "part of " a Car.
        ///             Allows complex objects to be constructed from smaller objects.

Car car= new Car("Corevette",2025,"V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

car.start();



    }

    }


