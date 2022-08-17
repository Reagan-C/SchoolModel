public  class Staff extends Person {

    private int age;
    private String qualification;
    private String gender;

    public Staff(long id, String name, String email, String password, String address, Roles role, School school, int age, String qualification, String gender) {
        super(id, name, email, password, address, role, school);
        this.age = age;
        this.qualification = qualification;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void apply(Staff staff) {
        if (!SchoolUtil.staffs.contains(staff)) {
            System.out.println("You have  successfully submitted your application");
        } else {
            System.out.println("You have an existing application");
        }
    }
}
