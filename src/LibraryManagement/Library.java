package LibraryManagement;

import java.util.ArrayList;
import java.util.HashSet;

public class Library {
    private String name;
    private ArrayList<Book> books;
    private HashSet<Student> students;
    Library(String name){
        this.name = name;
        books = new ArrayList<>();
        students = new HashSet<>();
    }
    public void addBook(int ISBN, String title, String author){
        books.add(new Book(ISBN, title, author));
    }
    public void addStudent(String name, int rollNo){
        students.add(new Student(name, rollNo));
    }
    public void displayAllBooks(){
        System.out.println("All books: ");
        for(Book book : books){
            System.out.println(book);
        }
    }
    public void displayStudents(){
        System.out.println("Registered students: ");
        for(Student student : students){
            System.out.println(student);
        }
    }
    public void checkOut(int rollNo, String title){
        Student student = findStudentByID(rollNo);
        Book book = searchBook(title);
        if(student == null){
            System.out.println("student not found.");
        }
        else if(book == null){
            System.out.println("Book not available.");
        }
        else if(book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(student.getName() + "has borrowed the book: " + book.getTitle());
        }
        else{
            System.out.println("The book is already checked out.");
        }

//        ------------------------------------------------------------------------

//        if(student != null && book != null && book.isAvailable() == true ){
//            book.setAvailable(false);
//            System.out.println(student.getName() + "has borrowed the book: " + book.getTitle());
//        }
//        else{
//            System.out.println("either book or student is not available.");
//        }
    }
    private Student findStudentByID(int rollNo){
        for(Student student : students){
            if(student.getRollNo() == rollNo)
                return student;
        }
        return null;
    }
    private Book searchBook(String title){
        for(Book book : books){
            if(book.getTitle().equals(title))
                return book;
        }
        return null;
    }
    private Book searchBook(String title, String author){
        for(Book book : books){
            if(book.getTitle().equals(title) && book.getAuthor().equals(author))
                return book;
        }
        return null;
    }
    public void listAvailableBooks(){
        boolean status = false;
        for(Book book : books){
            if(book.isAvailable()) {
                status = true;
                System.out.println(book);
            }
        }
        if(!status)
            System.out.println("book is not available");
    }
    public void removeStudent(int rollNo){
        Student student = findStudentByID(rollNo);
        if(student == null){
            System.out.println("student does not exist.");
        }
        else {
            students.remove(student);
            System.out.println("student removed successfully: " + student.getName());
        }
    }
    public void checkedOutBooks(){
        System.out.println("Checked out books: ");
        for(Book book : books){
            if(!book.isAvailable())
                System.out.println(book);
        }
    }
    public void searchBooksByAuthor(String title, String author){
        Book book = searchBook(title, author);
        if(book != null){
            System.out.println(book);
        }
        else
            System.out.println("book not found.");
    }
    public void returnBook(int ISBN){
        for(Book book : books){
            if(book.getISBN() == ISBN && !book.isAvailable()){
                book.setAvailable(true);
                return;
            }
        }
    }
    public void removeBook(String title, String author){
        for(Book book : books){
            if(book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                books.remove(book);
                System.out.println("book removed successfully");
            }
        }
    }
}
