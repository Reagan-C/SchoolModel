public  class Principal extends Person{
    private String yearsOfExperience;
    private String maritalStatus;


    public Principal(String yearsOfExperience, String maritalStatus, String name, long id, String email, String password,String address, Roles role, School school) {
        super(id, name, email,password,address,role,school );
        this.yearsOfExperience = yearsOfExperience;
        this.maritalStatus = maritalStatus;
    }


    public String  expel(String name) {
        String response;
        for (Student student:  SchoolUtil.students)
            if (student.getName().equalsIgnoreCase(name)) {
                SchoolUtil.students.remove(student);
                response = "Dear " + student.getName() + ", You have been expelled from " + student.getSchool().getName();
                return response;
            }
        response = name+ " was not found in the database";
        return  response;
    }


    public void admit(Applicants student) {
        if (student.getAge() >= 12) {
            Student newStudent = new Student(student.getName(),student.getAge(), student.getGender(),student.getId(),student.getEmail(),student.getPassword(),student.getAddress(), Person.Roles.STUDENT,student.getSchool());
            if (!SchoolUtil.students.contains(newStudent.getId())) {
                SchoolUtil.students.add(newStudent);
                SchoolUtil.applicants.remove(student);
                System.out.println("Dear "+ student.getName() +", You have been successfully admitted");
            }else {
                System.out.println("Student ID already exists in school");
            }

        }else{
            System.out.println("Underage students are not allowed");
        }
    }

    public void employStaff(Staff staff) {
        if (staff.getAge() < 40) {
            if (!SchoolUtil.staffs.contains(staff)) {
                SchoolUtil.staffs.add(staff);
                System.out.println("Dear "+ staff.getName() +",Welcome to our School! You have been employed successfully");
            }else {
                System.out.println(staff.getName() + " is already a staff of this school");
            }

        }else{
            System.out.println("We only employ staff below 40 years old");
        }
    }

    public void updateTeacherInfo(Teacher teacher) {


        if ((!SchoolUtil.teachers.contains(teacher)) && (teacher.getAge() > 25 ) && (teacher.getAge() < 45)) {
            if (teacher.getcourseTaught() != null) {
                SchoolUtil.teachers.add(teacher);
                Staff newTeacher = new Staff(teacher.getId(),teacher.getName(),teacher.getEmail(),teacher.getPassword(),
                        teacher.getAddress(),Person.Roles.TEACHER,teacher.getSchool(),
                        teacher.getAge(),teacher.getQualification(),teacher.getGender());
                SchoolUtil.staffs.add(newTeacher);
                System.out.println(teacher.getName() + "'s profile has successfully been updated in the teacher's database");
                System.out.println(teacher.getName() + "'s profile has also successfully been updated in the staff'S database");
            }else {
                System.out.println("Teacher has not updated profile yet");
            }
        }else {
            System.out.println("We can not update your info in our database at this time because you couldn't meet the required criteria ");
        }

    }

}
