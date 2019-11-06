import java.util.ArrayList;
import java.util.Scanner;

public class TranscriptApp {
    public static void main(String[] args) {
    Transcript transcript = new Transcript();
    transcript.addCourse();
        String cAnswer;
        String sAnswer;
        System.out.println("Welcome to the transcript application.");
        Scanner sc = new Scanner(System.in);

        do {
            Transcript student = new Transcript();
            System.out.println("Enter Student ID number: ");
            int sID = sc.nextInt();
            student.setStudentID(sID);
            System.out.println("Enter Student's first name: ");
            String sFName = sc.next();
            student.setFirstName(sFName);
            System.out.println("Enter Student's last name: ");
            String sLName = sc.next();
            student.setLastName(sLName);

            ArrayList<Course> arrclass = new ArrayList<>();
            do {
                Course item = new Course();
                System.out.println("Enter course: ");
                String cName = sc.next();
                item.setCourseName(cName);
                System.out.println("Enter credits: ");
                int cNum = sc.nextInt();
                item.setCredits(cNum);
                System.out.println("Enter grade: ");
                String cGrade = sc.next();
                item.setGrade(cGrade);
                if (cGrade.equalsIgnoreCase("A")) {
                    item.setQualityPoints(4);
                } else if (cGrade.equalsIgnoreCase("B")) {
                    item.setQualityPoints(3);
                } else if (cGrade.equalsIgnoreCase("C")) {
                    item.setQualityPoints(2);
                } else if (cGrade.equalsIgnoreCase("D")) {
                    item.setQualityPoints(1);
                } else {
                    item.setQualityPoints(0);
                }
                arrclass.add(item);
                student.setClasses(arrclass);
                System.out.println("Another course? (y/n)");
                cAnswer = sc.next();
            } while (cAnswer.equalsIgnoreCase("y"));
            System.out.println("Another student? (y/n)");
            sAnswer= sc.next();
        }while (sAnswer.equalsIgnoreCase("y"));

    }
}
