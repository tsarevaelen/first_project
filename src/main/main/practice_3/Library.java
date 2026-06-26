package practice_3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public String getBookTitle(){
        return this.bookTitle;
    }

    void setBookTitle(String newBookTitle){
        this.bookTitle = newBookTitle;
    }

    public String getAuthor(){
        return this.author;
    }

    void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public int getYear(){
        return this.year;
    }

    void setYear(int newYear){
        this.year = newYear;
    }

    public String getCategory(){
        return this.category;
    }

    void setCategory(String newCategory){
        this.category = newCategory;
    }
}
