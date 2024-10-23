/*
    **Class vs Array + String**

    1. Modeling Complex Data
    Objects: They allow you to model complex entities that have multiple attributes and behaviors. For instance, if you are working with a Person, you may want to store attributes like name, age, and address and methods to perform actions like birthday().

    Arrays and Strings: While you can use an array of strings to store names or an array of integers for ages, it becomes cumbersome to manage and understand when you have multiple attributes per entity. For example, if you had to store names and ages together, you'd need two arrays or a 2D array, which is not intuitive.


    2. Improved Readability and Maintainability
    Objects: The code is often easier to read and understand. For example, calling car1.start() is clear and indicates that start() is an operation related to car1.

    Arrays and Strings: When using arrays, you might have to refer to elements by index, which can make the code less clear. For instance, cars[0] does not convey the purpose of the value it references as well as car1.

    and so on!

*/


/* Imagine you’re developing a simple application to manage books in a library. */

// Using Objects:

class Book {
    String title;
    String author;
    int yearPublished;

    Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + yearPublished);
    }
}

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        
        book1.displayInfo();
        book2.displayInfo();
    }
}



//OR
// Using Arrays:
public class Library {
    public static void main(String[] args) {
        String[] titles = {"1984", "To Kill a Mockingbird"};
        String[] authors = {"George Orwell", "Harper Lee"};
        int[] years = {1949, 1960};

        for (int i = 0; i < titles.length; i++) {
            System.out.println("Title: " + titles[i] + ", Author: " + authors[i] + ", Year: " + years[i]);
        }
    }
}
