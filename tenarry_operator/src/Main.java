public class Main {

    public static void main(String []args){
        /// ternary operator ? =Return 1 of 2 values if a condition is true
        /// variable=(condition) ? ifTrue :ifFalse;

  int score = 70;

//  if(score >= 60){
//      System.out.println("pass");
//
//  }else{
//      System.out.println("Fail");
//  }


//        String passOrFail = (score>= 60)? "PASS":"FAILS";
//        System.out.println(passOrFail);



  int number =90;

        String evenOrodd=(number % 2 == 0)? "Even ":"Odd";
        System.out.println(evenOrodd);


        int hours =13;
        String timeOfDay=(hours <12)? "A.M":"P.M";
        System.out.println(timeOfDay);


        int income= 60000;
        double taxRate =(income >=40000) ?0.25 :0.15;
        System.out.println(taxRate);




    }
}
