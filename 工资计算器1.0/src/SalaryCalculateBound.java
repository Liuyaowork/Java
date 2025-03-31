import java.util.InputMismatchException;
import java.util.Scanner;

public class SalaryCalculateBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // 欢迎信息和操作提示
            System.out.println("欢迎使用职工工资计算系统!");
            System.out.println("选择进行的操作类型:1.用户类型 2.单个职工工资计算 3.多个职工工资计算 4.退出");

            // 获取用户选择的操作类型
            int operationType = getOperationType(sc);

            // 获取职工信息
            String empName = getEmployeeName(sc);
            boolean sex = getEmployeeSex(sc);

            // 计算工资
            double salary = calculateSalary(sc);

            System.out.println("职工姓名：" + empName);
            System.out.println("性别：" + (sex ? '男' : '女'));
            System.out.println("工资：" + salary);
        } catch (InputMismatchException e) {
            System.out.println("输入格式错误，请重新运行程序并输入正确的数据。");
        } finally {
            sc.close();
        }
    }

    private static int getOperationType(Scanner sc) {
        int op;
        while (true) {
            System.out.print("请输入操作类型 (1-4): ");
            op = sc.nextInt();
            if (op >= 1 && op <= 4) {
                System.out.println("你选择的是1~4");
                break;
            } else {
                System.out.println("你选择的不在1~4之间，请重新输入。");
            }
        }
        return op;
    }

    private static String getEmployeeName(Scanner sc) {
        System.out.print("请输入职工姓名：");
        return sc.next();
    }

    private static boolean getEmployeeSex(Scanner sc) {
        System.out.print("请输入职工性别:男 true 女 false: ");
        return sc.nextBoolean();
    }

    private static double calculateSalary(Scanner sc) {
        System.out.print("请输入基本工资：");
        double basicPay = sc.nextDouble();

        System.out.print("请输入津贴：");
        float allowance = sc.nextFloat();

        System.out.print("请输入奖金：");
        int bonus = sc.nextInt();

        return basicPay + allowance + bonus;
    }
}
