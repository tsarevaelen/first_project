package practice_2;

public class Book {
    public static void main(String[] args){
        Book chaika = new Book("Чайка", "Чехов");
        System.out.println("Название книги: " + chaika.title + ", автор: " + chaika.author);

        chaika.setTitle("Chaika");
        System.out.println(chaika.title);

        chaika.setAuthor("Бунин");
        System.out.println(chaika.author);

        chaika.printinfo();



    }

    String title;
    String author;

    Book(String someTitle, String someAuthor){
        this.title = someTitle;
        this.author = someAuthor;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return  this.author;
    }

    void setTitle(String newTitle){
        this.title = newTitle;
    }
    void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    void printinfo(){
        System.out.println("Название книги: " + this.title + ", автор: " + this.author);
    }


}
