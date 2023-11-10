package LibraryManagement;

public class Student {
    private String name;
    private int rollNo;
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    public String getName(){
        return this.name;
    }
    public int getRollNo(){
        return this.rollNo;
    }

    @Override
    public String toString() {
        return name + " : " + rollNo;
    }
}
