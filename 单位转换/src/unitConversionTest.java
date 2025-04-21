import chap01.UnitConversion;
import java.util.Scanner;

public class unitConversionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnitConversion uc = new UnitConversion(0, 0, 0, 0);

        System.out.println("请输入英寸值：");
        double inch = scanner.nextDouble();
        uc.inchToCm(inch);
        System.out.println("转换为厘米：" + uc.getCm());

        System.out.println("请输入华氏温度值：");
        double f = scanner.nextDouble();
        uc.fToC(f);
        System.out.println("转换为摄氏温度：" + uc.getC());

        scanner.close();
    }
}
