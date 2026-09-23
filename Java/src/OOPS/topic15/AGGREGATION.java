package OOPS.topic15;

public class AGGREGATION {
    static void main(String[] args) {

        // AGGREGATION = Represents a 'has-a' relation between objects.
        //               one object contains another object as a part of its structure,
        //               but the contained object's can exist independently.


        Book book1 = new Book("Fellowship of the ring", 1000);
        Book book2 = new Book("return of the king" , 2000);

        Book[] books = {book1,book2};

        Library library = new Library("NYC public library", 1897, books);
        library.displayInfo();




    }
}
