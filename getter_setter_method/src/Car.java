public class Car {

    private String model;
    private String color;
    private int price;

    Car (String model , String color, int price){
         this.model= model;
         this.color= color;
         this .price= price;




    }
String getModel(){
        return this.model;

}
String getColor(){
        return this.model;

}

int  getPrice(){
        return this.price;

}
void setModel(String model){
        this.model = model;

}
void  setColor(String color){
        this.color= color;

}
void setPrice(int price){
//        this.price= price;
    if(price <0){
        System.out.println("Price can't be less than zero");
    }
    else{
        this.price = price;
    }
}


}
