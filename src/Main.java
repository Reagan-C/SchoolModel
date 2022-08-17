public class Main {
    public static void main(String[] args) {

        System.out.println("Number of Applicants: "+ SchoolUtil.applicants.size());
        System.out.println("Number of Students: "+ SchoolUtil.students.size());

School school = new School("St Paul's Model School","Plot 1B Amuzukwu road,Abia State",1999,"Semper Bonum Examplum");
Principal principal = new Principal("15","Married","Mr. Columba Onowu",101,
        "columba.o@yahoo.com","123","No 23 awkuzu street, aba", Person.Roles.PRINCIPAL,school);
        SchoolUtil.principals.add(principal);

            System.out.println("Number of Principals: "+ SchoolUtil.principals.get(0).getName());

Applicants applicant = new Applicants(12,"Male",1,"Obi","Obi@gmail.com","123","amachi street",
        Person.Roles.APPLICANT,school);

        applicant.apply(applicant);


        System.out.println("Number of Applicants: "+ SchoolUtil.applicants.size());
        System.out.println("Number of Students: "+ SchoolUtil.students.size());

        principal.admit(applicant);

        System.out.println("Number of Applicants: "+ SchoolUtil.applicants.size());
        System.out.println("Number of Students: "+ SchoolUtil.students.size());

        Applicants applicant1 = new Applicants(11,"Male",1,"Obi","Obi@gmail.com","123","amachi street",
                Person.Roles.APPLICANT,school);

        principal.admit(applicant1);
        System.out.println("Number of Students: "+ SchoolUtil.students.size());
        System.out.println("Number of Applicants: "+ SchoolUtil.applicants.size());


        Teacher teacher = new Teacher(1,"Emy","emy.com","123","aba", Person.Roles.TEACHER,school,
                null,35,"b.eng","male");

        Course course = new Course(1,"Maths",null);
        SchoolUtil.courses.add(course);
        System.out.println(SchoolUtil.courses.toString());



        teacher.teach(teacher,course);
        System.out.println(SchoolUtil.courses.toString());
        System.out.println(SchoolUtil.students.get(0).toString());
        System.out.println("Before taking course");

        SchoolUtil.students.get(0).take(course);
        System.out.println(SchoolUtil.students.get(0).toString());
        System.out.println("After taking 1st course");

        SchoolUtil.students.get(0).take(course);
        System.out.println("After taking 2nd course");

        Course course1 = new Course(2,"Igbo",null);
        SchoolUtil.students.get(0).take(course1);

        SchoolUtil.courses.add(course1);
        System.out.println(SchoolUtil.courses.toString());
        SchoolUtil.students.get(0).take(course1);
        System.out.println("Adding 2nd course");
        Course course2 = new Course(3,"English",null);
        SchoolUtil.courses.add(course2);

        SchoolUtil.students.get(0).take(course2);

        Teacher teacher1 = new Teacher(2,"Aziki","aziki.com","122","odu street",
                Person.Roles.TEACHER,school,course1,30, "H.ND","Female");
        teacher1.teach(teacher1,course2);

        Staff staff = new Staff(1,"Ben","Ben.com","222","chukwuka street,aba",
                Person.Roles.STAFF,school,32, "HND","Male");
        staff.apply(staff);
        principal.employStaff(staff);
        staff.apply(staff);
        principal.employStaff(staff);

        course2.setcourseTeacher("Aziki");
        course1.setcourseTeacher("Okoro");
        principal.updateTeacherInfo(teacher1);
        System.out.println(SchoolUtil.teachers);
        principal.updateTeacherInfo(teacher);
    }

}
