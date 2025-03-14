import java.util.Scanner;

public class SalaryCalculateBound {
    public static void main(String[] args) {

        // 欢迎信息和操作提示
        System.out.println("欢迎使用职工工资计算系统!");
        System.out.println("选择进行的操作类型:1.用户类型 2.单个职工工资计算 3.多个职工工资计算 4.退出");

        // 获取用户选择的操作类型
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        // 判断用户选择的操作类型是否在1~4之间
        boolean opResult = op == 1 || op == 2 || op == 3 || op == 4;
        String result = opResult ? "你选择的是1~4" : "你选择的不在1~4之间";
        System.out.println(result);

        // 获取职工信息
        System.out.println("请输入职工姓名：");
        String empName = sc.next();
        System.out.println("职工姓名：" + empName);

        System.out.println("请输入职工性别:男 true 女 false");
        boolean sex = sc.nextBoolean();
        System.out.println("性别：" + (sex ? '男' : '女'));

        // 计算工资
        System.out.println("计算工资");
        System.out.println("请输入基本工资：");
        double basicPay = sc.nextDouble();

        System.out.println("请输入津贴：");
        float allowance = sc.nextFloat();

        System.out.println("请输入奖金：");
        int bonus = sc.nextInt();

        double salary = basicPay + allowance + bonus;
        System.out.println("工资：" + salary);

        sc.close();
    }
}
