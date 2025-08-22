public class Main {

    public static void main(String [] args){

        /// Super = Refers to the parent class (subclass <- superclass)
        ///         Used in constructors and method overriding
        ///         Calls the parent constructor to initialize attributes


 Person person = new Person("Easin","Khandokar");
 Student student=new Student("Harry","Potter",3.25);
 Employee employee= new Employee("kuddus", "Ali", 70000);



 person.showName();
        System.out.println(student.gpa);
        student.showGPA();

        employee.showSalary();

    }


}
