import java.util.concurrent.locks.Condition;

public class Engine {
   String type;
   Codition condition;
   Engine(String type,String conditionvalue){
       this.type=type;
       this.condition=new Codition(conditionvalue);
       System.out.println("Engine created :" +type);
   }
   void enginedetails(){
       System.out.println("update engine :" + type);

   }

}
