package practice_3;

public class LibraryTest {
    public static void main(String[] args){
        Library book = new Library();

        book.setBookTitle("Чайка");
        System.out.println("Название книги: " + book.getBookTitle());

        book.setAuthor("Чехов");
        System.out.println("Автор: " + book.getAuthor());

        book.setYear(1972);
        System.out.println("Год выпуска: " + book.year);

        book.setCategory("Роман");
        System.out.println("Категория: " + book.category);
    }
}
