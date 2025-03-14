import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a , c;
        float r = 0 , f , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入奖金a: ");
        a = sc.nextInt();
        if(a >= 5000)
            c = 10;
        else
            c = a / 500;
            switch(c){
                case 0:r = 0;break;
                case 1:r = 3;break;
                case 2:
                case 3:r = 5;break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:r = 8;break;
                case 10:r = 12;break;
                }
            b = a * r/100;
            f = a - b;   
            System.out.println("税率：" + r + "应交税款是：" + b + "应得奖金是: " + f);
    }
}
