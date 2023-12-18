package task1.libraryreadertask;

import java.time.LocalDate;
import java.util.Arrays;

public class Reader {

    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private LocalDate dateOfBirth;
    private Long phone;

    public void takeBook(){}

    public void returnBook(){}

    public void takeBook(int numberOfBooks) {
        System.out.printf("%s took %d books\n", this.fullName, numberOfBooks);
    }

    public void takeBook(String... names) {
        StringBuilder sb = new StringBuilder();
        for(String s : names) {
            sb.append(s).append(", ");
        }
        String namesOfBooks = sb.toString().trim();
        namesOfBooks = namesOfBooks.substring(0, namesOfBooks.length()-1);
        System.out.printf("%s took books: %s\n", this.fullName, namesOfBooks);
    }

    public void takeBook(Book... books) {
        StringBuilder sb = new StringBuilder();
        for(String s : Arrays.stream(books).map(Book::getName).toList()) {
            sb.append(s).append(", ");
        }
        String nameOfBooks = sb.toString().trim();
        nameOfBooks = nameOfBooks.substring(0, nameOfBooks.length()-1);
        System.out.printf("%s took books: %s\n", this.fullName, nameOfBooks);
    }

    public void returnBook(int numberOfBooks) {
        System.out.printf("%s returned %d books\n", this.fullName, numberOfBooks);
    }

    public void returnBook(String...names) {
        StringBuilder sb = new StringBuilder();
        for(String s : names) {
            sb.append(s).append(", ");
        }
        String namesOfBooks = sb.toString().trim();
        namesOfBooks = namesOfBooks.substring(0, namesOfBooks.length()-1);
        System.out.printf("%s returned books: %s\n", this.fullName, namesOfBooks);
    }

    public void returnBook(Book... books) {
        StringBuilder sb = new StringBuilder();
        for(String s : Arrays.stream(books).map(Book::getName).toList()) {
            sb.append(s).append(", ");
        }
        String nameOfBooks = sb.toString().trim();
        nameOfBooks = nameOfBooks.substring(0, nameOfBooks.length()-1);
        System.out.printf("%s returned books: %s\n", this.fullName, nameOfBooks);
    }
}
