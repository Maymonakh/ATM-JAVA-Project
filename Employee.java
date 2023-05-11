package maymonakhanfar201910408;

public class Employee extends User {

    private String job;
    private String company;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String job, String company, double salary, int ID, String name, String gender,
            int age, String address, String email, String password, int phone) {
        super(ID, name, gender, age, address,email, password, phone);

        this.job = job;
        this.company = company;
        this.salary = salary;

    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String printInfo() {
        return " ID = " + ID + "\n name = " + name + "\n gender = " + gender + "\n age = " + age + "\n address = "
                + address + "\n email = " + email + "\n password = " + password + "\n phone = " + phone
                + "\n job = " + job + "\n company = " + company + "\n salary = " + salary ;
             
    }

}
