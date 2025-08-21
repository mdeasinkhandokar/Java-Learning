public class Main {

    public static void main(String[] args){

        /// overloaded constructor= Allow a class to have multiple constructors
        ///                        with different parameter list.
        ///                        Enable objects to be intialized in various ways.



        User user1 =new User("Easin");
        User user2= new User("Easin","EK@gmail.com");
        User user3= new User("Easin","EK@gmail.com",24);


        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);



        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);



        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);


    }


}
