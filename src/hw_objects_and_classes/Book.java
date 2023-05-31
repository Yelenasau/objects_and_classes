package hw_objects_and_classes;

import java.util.Objects;

public class Book {

    private final String name;
    private int year;
    private final Author author;

    public Book (String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
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

    @Override
    public String toString() {
        return "Название: " + this.name + " Год: " + this.year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(name, book.name) && Objects.equals(year, book.year) && author == book.author;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, year, author);
    }
}