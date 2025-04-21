import task6.Employee;
import java.util.Scanner;
public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.print("请输入职工编号：");
        String id = scanner.nextLine();
        System.out.print("请输入职工姓名：");
        String name = scanner.nextLine();
        System.out.print("请输入职工部门：");
        String department = scanner.nextLine();
        System.out.print("请输入职工性别：");
        char sex = scanner.nextLine().charAt(0);
        System.out.print("请输入职工身份证号：");
        String cardID = scanner.nextLine();
        System.out.print("请输入职工电话：");
        String phoneNumber = scanner.nextLine();
        System.out.print("请输入职工邮箱：");
        String email = scanner.nextLine();

        employee.setId(id);
        employee.setName(name);
        employee.setDepartment(department);
        employee.setCardID(cardID);
        employee.setSex(sex);
        employee.setPhoneNumber(phoneNumber);
        employee.setEmail(email);
        employee.showEmployee();
        Employee e2 = new Employee("001", "李明", "人事部", "123456789012345678", '女', "12345678901", "123456@qq.com");
        e2.showEmployee();
    }
}
