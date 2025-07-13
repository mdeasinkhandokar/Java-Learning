public class Main {

    public static void main(String[] args){

        String name= "Easin Khandokar";

        int length= name.length();
        char letter =name.charAt(2);
        int index = name.indexOf(" ");
        int lastIndex=name .lastIndexOf("o");

        ///name= name.toUpperCase();
        ///name = name.toLowerCase();
        ///name= name.trim();

        ///name=name.replace("a","y");






        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);



        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello "+name);
        }
*/

        /*
        if(name.contains(" ")){
            System.out.println("Your name contains a space");

        }
        else{
            System.out.println("Your name Dosen't contain any spaces");
        }

         */

if(name.equals("easin khandokar")){
    System.out.println("Your name can't be easin khandokar");
}
else{
    System.out.println("Hello "+name);
}


    }
}
