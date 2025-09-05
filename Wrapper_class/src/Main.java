public class Main {

    public static void main(String[] args){
        /// Wrapper classes = allow primitive values (int , char double , boolean)
        ///                  to be used as objects."Wrap tem in an object"
        ///                   Generally , don't weap primitive unless you need an object.
        ///                  Allows use of collections framework and static utility methods.

//      object
//     Integer a = new  Integer(123);
//     Double b = new Double (3.14);
//     Character c= new Character('$');
//     Boolean d = new Boolean(true);


/// AutoBoxing
//        Integer a = 123;
//        Double b = 3.14;
//        Character c= '$';
//        Boolean d = true;



        /// Unboxing
//        Integer x1= a;
//        boolean x=d;


String a = Integer.toString(123);
String b = Double.toString(3.14);
String c= Character.toString('@');
String d = Boolean.toString(false);

String x= a+b+ c+d;

        System.out.println(x);




    }



}
