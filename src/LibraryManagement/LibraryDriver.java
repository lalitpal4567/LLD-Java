package LibraryManagement;

public class LibraryDriver {
    public static void main(String[] args) {
        Library library = new Library("ASPAM Library");

        // adding students in the library
        library.addStudent("Sachin", 10001);
        library.addStudent("Lalit", 10002);
        library.addStudent("Komal", 10003);
        library.addStudent("Pallavi", 10004);

        // adding books in the library
        library.addBook(501, "Maths IV", "Raj Sinha");
        library.addBook(502, "Technical Communication", "RS. Kumar");
        library.addBook(503, "History", "Sanjay Gowda");
        library.addBook(504, "Business & Account", "Nirmala Raman");
        library.addBook(505, "Environmental Science", "Raj Kishore");

    }
}
