package OOPS.topic15;

public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] bookks){
        this.name = name;
        this.year = year;
        this.books = bookks;

    }

    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Available: ");
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
    }

}
