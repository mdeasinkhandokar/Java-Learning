public class Main {

    public static void main(String[] args){
        //They help protect object data and add rules for accessing or modify them
        //Getters = Methods that make a field READABLE
        //SETTERS= Methods that make a field WRITEABLE

        Car car= new Car("Charger", "Yellow", 10000);


//        car.model= "Corvette";
         car.setModel("Corvette");
        car.setColor("Blue");
        car.setPrice(-11);
        System.out.println(car.getColor() + " "+car.getModel() + " " +car.getPrice());

    }



}
