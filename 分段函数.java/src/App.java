import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入函数x的定义域: ");
        x = sc.nextInt();
        if(x >= 0){
            if(x >= 10){
                y = x * x * x;
            }
            else{
                y = x * x - 5;
            }
        }
        else{
            y = x + 1;
        }
        System.out.println("值域y: " + y);
    }
}
