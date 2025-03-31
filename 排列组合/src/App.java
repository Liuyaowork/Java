import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("请在健盘上输入一个三位数n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 10;
        int m = c * 100 + b * 10 + a;
        System.out.println("n排列重组后:" + m); 

    }
}
