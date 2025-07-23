import java.util.Scanner;


public class Main {
    public static void main(String[]args){

        //.Substring() = A method used to extract a portion of a string .substring(strar, end)


        Scanner scanner =new Scanner(System.in);

//        String email ="easin@gmail.com";
//        String username=email.substring(0, 6);
//        String domain=email.substring(6,15);

//        String username=email.substring(0,email.indexOf("@"));
//        String domain=email.substring(email.indexOf("@"));
//
//
//        System.out.println(username);
//        System.out.println(domain);





        String email;
        String username;
       String domain;

        System.out.println("Enter your email");

        email=scanner.nextLine();
        if(email.contains("@")){
            username=email.substring(0,email.indexOf("@"));
            domain=email.substring(email.indexOf("@")+1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails must contain @");
        }



  scanner.close();

    }
}
