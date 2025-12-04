import java.util.List;

public class App {
    public static void main(String[] args) {
        CRUDUtils.saveStudent(new Student("John", "Doe", "Python"));
        CRUDUtils.updateStudent(1, "Python");
        System.out.println(CRUDUtils.getStudentData("SELECT * FROM students"));
        CRUDUtils.deleteStudent(1);
        System.out.println(CRUDUtils.getStudentData("SELECT * FROM students"));
    }
}
