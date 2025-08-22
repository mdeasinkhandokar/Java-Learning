public class Circle extends Shape {

    double radius;

    Circle(double radius){
        this.radius= radius;

    }



    @Override
    double area(){
//        return 0;
        return Math.PI*radius*radius;
    }




}
