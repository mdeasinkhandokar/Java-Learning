public class Main {

    public static void main(String[]args){
        /// Constructor = A special method to initialize objects
        ///                You can pass arguments to a constructio
        ///                and set up initial values


        Student student1= new Student("Easin",40, 3.2);
        Student student2= new Student("Khandokar", 23,4.9);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);


        student1.study();
       student2.study();



    }



}
