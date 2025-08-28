public class main {

    public static void main(String[] args){
        /// Interface = A blueprint for a class that specifies a set of abstract method
        ///            that implementing classes MUST define.
        ///            Supports multiple inheritance like behavior.


        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

//
//        rabbit.flee();
//        hawk.hunt();
        fish.flee();
        fish.hunt();




    }
}
