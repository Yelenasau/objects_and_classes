package hw_objects_and_classes;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Иван", "Тургенев");
        Author author2 = new Author("Валентин", "Пикуль");

        Book book1 = new Book("Муму", 1852, author1);
        Book book2 = new Book("Нечистая сила", 1979, author2);
        System.out.println("Автор: " + author1.getFullName());
        System.out.println("Автор: " + author2.getFullName());

        System.out.println("Название книги: " + book1.getName() + ", год издания книги: " + book1.getYear() + ", автор книги: " + book1.getAuthor().getFullName());
        System.out.println("Название книги: " + book2.getName() + ", год издания книги: " + book2.getYear() + ", автор книги: " + book2.getAuthor().getFullName());

        System.out.println("book1.toString() = " + book1);
        System.out.println("book2.toString() = " + book2);

        System.out.println("author1.toString() = " + author1);
        System.out.println("author2.toString() = " + author2);

        System.out.println("book1.equals() = " + book1.equals(book2));
        System.out.println("book1.equals() = " + book2.equals(book2));

        System.out.println("author1.equals() = " + author1.equals(author2));
        System.out.println("author2.equals() = " + author2.equals(author2));

        System.out.println("Хеш код автора " + book1.getAuthor() + " " + author1.hashCode());
        System.out.println("Хеш код автора " + book2.getAuthor() + " " + author2.hashCode());
        System.out.println("Хеш код книги " + book1.getName() + " " + book1.hashCode());
        System.out.println("Хеш код книги " + book2.getName() + " " + book2.hashCode());
    }
}
