import java.util.Scanner;
public class MultiEmpSalCal {
    //初始化多名员工工资数组
    public double [] [] initMultiEmpSal() {
        System.out.println("请输入用户数量: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] [] empSalary = new double [n] [5];  
        return empSalary;      
    }
    //初始化多名员工姓名的一维数组
    public String [] initMultiEmpName (double [] [] empSalary) {
        String [] empName = new String[empSalary.length];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < empSalary.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个员工的姓名: ");
            empName[i] = sc.next();
        }
        return empName;
    }
    //计算员工工资
    public double [] [] calculateTotalSalary (double [] [] empSalary){
        Scanner sc = new Scanner(System.in);
        int i, j;
        for (i = 0; i < empSalary.length; i++){
            System.out.println("请输入第" + (i + 1) + "个员工的基本工资，津贴和奖金: ");
            for (j = 0; j < empSalary[i].length - 2; j++){
                empSalary[i] [j] = sc.nextDouble();
            }
            System.out.println("请输入统计时间（月份）: ");
            empSalary[i] [j] = sc.nextDouble();
        }
        for (i = 0; i < empSalary.length; i++){
            empSalary[i] [4] = empSalary[i] [0] * empSalary[i] [3] + empSalary[i] [1] + empSalary[i] [3] + empSalary[i] [2];
        }
        return empSalary;
    }
    //显示员工工资
    public void showEmpSalary (String [] userName, double [] [] empSalary){
        int i, j;
        System.out.println("职工姓名\t基本工资\t津贴\t\t奖金\t\t统计月份\t总工资");
        for (i = 0; i < userName.length; i++){
            System.out.print(userName[i] + "\t");
            for (j = 0; j < empSalary[0].length; j++){
                System.out.print("\t");
                System.out.print(empSalary[i][j] + "\t");
            }
            System.out.println();
        }
    } 
    //主函数
    public static void main (String [] args){
        MultiEmpSalCal multiEmpSalCal = new MultiEmpSalCal();
        System.out.println("欢迎使用员工工资计算器！");
        double [] [] empSalary = multiEmpSalCal.initMultiEmpSal();
        String [] empName = multiEmpSalCal.initMultiEmpName(empSalary);
        empSalary = multiEmpSalCal.calculateTotalSalary(empSalary);
        multiEmpSalCal.showEmpSalary(empName, empSalary);
        System.out.println("谢谢使用！");
    }
}
