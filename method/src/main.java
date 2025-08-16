public class main {


    public static void main(String[] args){

        //method = a block of reusable code that is executed when called()

        String name = "Easin";
        int age= 25;




        happyBirthday(name ,age );


//        happyBirthday();
//        happyBirthday();

//        double result =square(3);
//        System.out.println(result);


        System.out.println(square(3));

        System.out.println(cube(3));

        String fullName= getFullName ("Easin ", "Khandokar");
        System.out.println(fullName);



 if(ageCheck(age)){
     System.out.println("You may sign up !");

 }
 else{
     System.out.println("You must be 18+ to sign up");
 }









    }

    static void happyBirthday(String name ,int age ) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you !\n");
    }

        static double square (double number){
            return number * number;
        }
static double cube(double number){
        return number *number * number ;

}

static String getFullName(String first , String last){
        return first + " " + last;

}

static boolean ageCheck(int age){
        if(age>= 18){
            return true;
        }
        else {
            return false;
        }
}

    }



