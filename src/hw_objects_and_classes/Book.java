package hw_objects_and_classes;

public class Book {

    private final String name;
    private final Author author;
    private int year;

    public Book (String name, int year, Author author) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName () {
        return name;
    }

    public int getYear () {
        return year;
    }

    public Author getAuthor () {
        return author;
    }

    public void setYear (int year) {
        this.year = year;
    }
}