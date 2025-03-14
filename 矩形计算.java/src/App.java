import java .util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("欢迎使用计算器");
        System.out.println("请输入个矩形的长：");
        Scanner sc = new Scanner(System.in);
        short l = sc.nextShort();
        System.out.println("请输入个矩形的宽：");
        short w = sc.nextShort();
        double c = 2 * (l + w);
        double s = l * w;
        System.out.println("矩形的周长是：" + c + "，面积是：" + s);
    }
}
