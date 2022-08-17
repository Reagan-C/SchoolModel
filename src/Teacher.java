import java.util.ArrayList;
import java.util.Arrays;

public class Teacher extends Person{

    private Course courseTaught;
    private int age;
    private String qualification;
    private String gender;
    private final ArrayList<String> qualifications = new ArrayList<>(Arrays.asList("B.ENG","B.SC","B.A","M.SC","M.A"));

    public Teacher(long id, String name, String email, String password, String address, Roles role, School school, Course courseTaught, int age, String qualification, String gender) {
        super(id, name, email, password, address, role, school);
        this.courseTaught = courseTaught;
        this.age = age;
        this.qualification = qualification;
        this.gender = gender;
    }

    public Course getcourseTaught() {
        return courseTaught;
    }

    public void setcourseTaught(Course courseTaught) {
        this.courseTaught = courseTaught;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void teach(Teacher teacher, Course course) {

        if (qualifications.contains(teacher.getQualification().toUpperCase())) {
            teacher.setcourseTaught(course);
            course.setcourseTeacher(teacher.getName());
            System.out.println("Dear " + teacher.getName() + ", Kindly proceed to teach " + teacher.getcourseTaught().getName());

        } else {
            System.out.println("Sorry " + teacher.getName() + ", you are not qualified to teach " + course.getName() + " in this school");
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "courseTaught=" + courseTaught +
                ", age=" + age +
                ", qualification='" + qualification + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
