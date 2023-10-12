
public class Main {
    public static void main(String[] args) {

    Student student = new Student();
    student.id = 1;
    student.fistName = "Junior";
    student.lastname = "Neymar";
    student.registeredCourse = "Java";
    student.userType = "Öğrenci";

    Instructor instructor = new Instructor();
    instructor.id = 2;
    instructor.fistName = "Zlatan";
    instructor.lastname = "Ibrahimoviç";
    instructor.instCourse = "Java";
    instructor.userType = "Eğitmen";

    UserManager userManager = new UserManager();
    userManager.AddUser(student);
    userManager.AddUser(instructor);
    }
}