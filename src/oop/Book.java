package oop;

public class Book {
    private String title;
    private String description;
    private String coverType;
    private int pagesNumber;
    private Author author;

    public Book(String title,String description, String coverType, int pagesNumber) {
        this.description=description;
        this.title = title;
        this.coverType = coverType;
        this.pagesNumber = pagesNumber;
        this.author=author;

    }
    public Book(String title,String description, String coverType, int pagesNumber, Author author) {
        this.description=description;
        this.title = title;
        this.coverType = coverType;
        this.pagesNumber = pagesNumber;
        this.author=author;

    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(String title, String coverType, int pagesNumber) {
        this.title = title;
        this.coverType = coverType;
        this.pagesNumber = pagesNumber;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString(){
    String x  = "Book title: " + title + " \n Story: " + description + " \nVolume is " +pagesNumber +
            " pages. \n "
            +(author!= null ? author.toString():" ");
    return x;
    }
}

