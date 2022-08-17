public abstract class Person {
    public enum Roles {
        PRINCIPAL,
        TEACHER,
        STUDENT,
        APPLICANT,
        STAFF
    }


    private long id;
    private String name;
    private String email;
    private String password;
    private String address;
    private Roles role;
    private School school;


    public Person(long id, String name, String email, String password,String address, Roles role, School school) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.role = role;
        this.school = school;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }



    public Roles getRole() {
        return role;
    }

    public School getSchool() {
        return school;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public void setSchool(School school) {
        this.school = school;
    }


}
