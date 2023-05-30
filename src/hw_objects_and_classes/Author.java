package hw_objects_and_classes;

import java.util.Objects;

public class Author {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }
    @Override
    public String toString() {
        return "Имя: " + this.name + " Фамилия: " + this.surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}