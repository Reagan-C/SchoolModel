public class Applicants extends Person{
    private int age;
    private String gender;

    public Applicants(int age,String gender, long id, String name, String email, String password,String address, Roles role, School school) {
        super(id, name, email, password,address, role, school);
        this.age = age;
        this.gender = gender;
    }

    public void apply(Applicants applicant) {
        if (!SchoolUtil.applicants.contains(applicant)) {
            SchoolUtil.applicants.add(applicant);
            System.out.println("You have  successfully submitted your application");
        }else {
            System.out.println("You have an existing application");
        }
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

    @Override
    public String toString() {
        return "Applicants{" +
                "age=" + age +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", role=" + getRole() +
                ", school=" + getSchool() +
                ", gender='" + gender + '\'' +
                '}';
    }
}
