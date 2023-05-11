package maymonakhanfar201910408;

abstract class User {

    protected int ID;
    protected String name;
    protected String gender;
    protected int age;
    protected String address;
    protected String email;
    protected String password;
    protected int phone;

    public User() {
    }
    
    

    public User(int ID, String name, String gender, int age, String address,String email, String password, int phone) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.email=email;
        this.password = password;
        this.phone = phone;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    
    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + ", email=" + email + ", password=" + password + ", phone=" + phone + '}';
    }

    abstract public String printInfo();

}
