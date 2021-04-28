import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    private double mark;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void printInfo() {
        System.out.println("**********");
        System.out.printf("Name %s %s \n",firstName,lastName);
        System.out.println("year "+year);
        System.out.println("gender "+(gender=='m'?"Male":"Female"));
        System.out.println("gender "+mark);
    }

    public void fullName(){
        System.out.println(firstName + " " + lastName);
    }
}
