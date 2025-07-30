import java.util.Scanner;


public class break_continue {
    public static void main(String[] args){
        /// break = break out of a loop (STOP)
        /// continue= skip current iteration of  a loop (SkIP)

        for(int i=0;i<10;i++){
            if(i==5){
               // break;
                continue;
            }
            System.out.println(i+ " ");
        }
    }
}
