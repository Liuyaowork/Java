package task6;
public class Employee {
    private String id;
    private String name;
    private String department;
    private String cardID;
    private char sex;
    private String phoneNumber;
    private String email;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getCardID() {
        return cardID;
    }
    public void setCardID(String cardID) {
        this.cardID = cardID;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Employee(String id, String name, String department, String cardID, char sex, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cardID = cardID;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public Employee() {

    }
    
    public void showEmployee() {
        System.out.println("职工编号：" + id + "，职工姓名：" + name + "，职工部门：" + department + "，职工身份证号：" + cardID + "，职工性别：" + sex + "，职工电话：" + phoneNumber + "，职工邮箱：" + email);
    }
}
