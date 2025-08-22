public class Main {


    public static void main(String[] args) {
        /// abstract =Used to define abstract classes and methods
        ///           abstract is the process of hiding implementation details
        ///          and showing only the essential features
        ///          Abstract classes can't be instantiated directly
        ///          Can  Contain ' abstract ' methods (which must be implemented)
        ///         Can contain 'concrete' methods(which are inherited)

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);
//
//        circle.display();
//        triangle.display();
//        rectangle.display();


        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(triangle.area());



    }

}