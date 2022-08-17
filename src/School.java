

public class School {
    private String name;
    private String address;
    private int foundDate;
    private String motto;


    public School(String name, String address, int foundDate, String motto) {
        this.name = name;
        this.address = address;
        this.foundDate = foundDate;
        this.motto = motto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(int foundDate) {
        this.foundDate = foundDate;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }
    public String coursesTaught() {
        if (SchoolUtil.courses.size() != 0) {
            String courses = "We offer a total of "+ SchoolUtil.courses.size()+ "courses in this school which include "+SchoolUtil.courses ;
            return courses;
        }
        return "School is still work in progress";
    }
}
