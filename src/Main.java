import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student[] studentsArr = new Student[7];
        studentsArr[0] = new Student("Andrew", 18, "Kyiv     ", "FICT", "IV-82");
        studentsArr[1] = new Student("Ann   ", 17, "Lviv     ", "FICT", "IV-84");
        studentsArr[2] = new Student("Den   ", 17, "Kharkiv  ", "FICT", "IV-84");
        studentsArr[3] = new Student("Ivan  ", 18, "Kharkiv  ", "FICT", "IV-83");
        studentsArr[4] = new Student("John  ", 16, "Lutsk    ", "FICT", "IV-84");
        studentsArr[5] = new Student("Ilya  ", 17, "Kyiv     ", "FICT", "IV-81");
        studentsArr[6] = new Student("Den   ", 19, "Chernigov", "FICT", "IV-73");

        System.out.println("Sorted by name for an increase:");
        System.out.print("\n");
        Arrays.sort(studentsArr, Comparator.comparing(Student::getName));
        for (Student s : studentsArr) {
            System.out.println(s);
        }
        System.out.print("\n");


        System.out.println("Sorted by age for a decrease:");
        System.out.print("\n");
        Arrays.sort(studentsArr, Comparator.comparing(Student::getAge).reversed());
        for (Student s : studentsArr) {
            System.out.println(s);
        }
        System.out.print("\n");

    }

}
