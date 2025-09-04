public class Main {
    /// Aggregation = Represents a "has- a" relationship between objects.
    ///       One object contains another object as part of its structure,
    ///       but the contained object/s can exist independently

    public static void main(String [] args){


        Book book1 = new Book("This Fellow of the ring", 423);
        Book book2 = new Book ("The Two  Towers", 352);
        Book book3= new Book ("The Return of the king",390);


        Book []  books = { book1, book2, book3};

//        System.out.println(book2.displayInfo());

//        for (Book book : books){
//            System.out.println(book.displayInfo());
//        }

        Library library = new Library("NYC public Library ", 1897,books);
        library.displayInfo();

    }

}
