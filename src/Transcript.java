import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Transcript {
    private int studentID;
    private String firstName;
    private String lastName;
    private ArrayList<Course> classes;

    public Transcript() {
    }

    public Transcript(int studentID, String firstName, String lastName, ArrayList<Course> classes) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.classes = classes;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

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

    public ArrayList<Course> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Course> classes) {
        this.classes = classes;
    }

    public void addCourse() {

    }



}



