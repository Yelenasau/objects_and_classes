package hw_objects_and_classes;
public class Author {

    private String name;
    private String surname;

    public String getname () {
        return name;
    }

    public void setname (String name) {
        this.name = name;
    }

    public String getSurname () {
        return surname;
    }

    public void setsurname (String surname) {
        this.surname = surname;
    }

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullName () {
        return name + " " + surname;
    }
}