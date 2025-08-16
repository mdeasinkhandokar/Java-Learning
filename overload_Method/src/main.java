public class main {

    public static void main (String [] args){

        ///Overloaded methods= methods that share the same name ,
        ///                   but different parameters
        ///                   signature = name  + parameters


        System.out.println(add(1,2));


    }



    static double add(double a, double b,double c){
        return a+b+c;
    }
    static double add(double a, double b){
        return a+b;
    }
    static  double add(double a, double b, double c, double d){
        return a+b+c+d;
    }








}
