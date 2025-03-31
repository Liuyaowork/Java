import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a, fen;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        fen = sc.nextInt();
        if(fen < 0 || fen > 100) {
            System.out.println("分数无效");
            return;
        }
        a = fen / 10;
        switch(a){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
                break;
        }
    }
}
