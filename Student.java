package maymonakhanfar201910408;

public class Student extends User {

    private int level;
    private String college;
    private String university;

    public Student() {
        super();
    }

    

    public Student(int level, String college, String university, int ID, String name, String gender,
            int age,String address,String email,String password,int phone){
                   super(ID, name, gender, age, address,email, password, phone);

            this.level = level;
        this.college = college;
        this.university = university;

    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String printInfo() {
        return  " ID = " + ID + "\n name = " + name + "\n gender = " + gender + "\n age = " + age + "\n address = "
                + address + "\n email = " + email + "\n password = " + password + "\n phone = " + phone
                + "\n level = " + level + "\n college = " + college + "\n university = " + university ;
    }

}
