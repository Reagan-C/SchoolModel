import java.util.ArrayList;

public  class Student extends Person{
    private int age;
    private String gender;

    private ArrayList<Course> courses;
    public Student(String name, int age, String gender, long id, String email, String password,String address, Roles role, School school) {
        super(id, name, email,password, address,role,school );

        this.courses = new ArrayList<>(1);
        this.age = age;
        this.gender = gender;

    }



    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }


    public void take(Course courseToTake) {
       if(SchoolUtil.courses.contains(courseToTake) ){
           if (this.courses.contains(courseToTake)) {
               System.out.println("You have already taken this course");
           }else {
               this.courses.add(courseToTake);
               System.out.println("Congratulations "+ getName() +", you can now proceed to take your "+ courseToTake.getName() + " lecture handled by "+ courseToTake.getcourseTeacher());
           }
       }else {
           System.out.println("We do not offer this course in this school at the moment");
       }
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", role=" + getRole() +
                ", school=" + getSchool() +
                ", courses=" + courses +
                '}';
    }
}
