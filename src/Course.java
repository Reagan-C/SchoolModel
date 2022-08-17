public class Course {

    private long id;
    private String name;
    private String courseTeacher;

    public Course(long id, String name, String courseTeacher) {
        this.id = id;
        this.name = name;
        this.courseTeacher = courseTeacher;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getcourseTeacher() {
        return courseTeacher;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setcourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseTeacher=" + courseTeacher +
                '}';
    }
}
