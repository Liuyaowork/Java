import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        float [] a = new float [30];
        float sum, main_sum;
        Scanner in = new Scanner(System.in);
        System.out.println("请依次输入30位同学的数学成绩：");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextFloat();
        }
        sum = 0; main_sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (a[i] < 60) {
                System.out.println("第" + (i + 1) + "位同学的数学成绩不及格！");
                main_sum += 1;
            }
        }
        System.out.println("30位同学的数学成绩的平均分为：" + sum / 30);
        System.out.println("30位同学中不及格的同学人数为：" + main_sum);
    }
}
