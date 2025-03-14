import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n,m = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数n：");
        n = sc.nextInt();
        if(n - m > 0){
            if(n % 2 == 0){
                System.out.println("n即是正数也是偶数");
            }else{
                System.out.println("n是正数但不是偶数");
            }
        }else{
            if(n % 2 == 0){
                System.out.println("n是负数但是偶数");
        }else{
                System.out.println("n是负数也是奇数");
            }
        }
    }
}
