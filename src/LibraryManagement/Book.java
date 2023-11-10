package LibraryManagement;

public class Book {
    private int ISBN;
    private String title;
    private String author;
    private boolean isAvailable;
    Book(int ISBN, String title, String author){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }
    public int getISBN(){
        return this.ISBN;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable = false;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + "\n" + "title: " + title + "\n" + "author: " + author + "\n"
                + "available: " + isAvailable;
    }
}
