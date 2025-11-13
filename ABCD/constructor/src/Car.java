public class Car {
String model ;
Engine engine;
Car(String model, String engineType,String  engineCondition){
    this.model=model;
    this.engine=new Engine(engineType,engineCondition);///constractor call
    System.out.println("Car created:" +model);

}
void showDetails(){
    System.out.println("Model : "+ model +", Engine Type: " + engine.type);

}



}
