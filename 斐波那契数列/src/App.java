public class App {
    public static void main(String[] args) throws Exception {
        int f1 = 1, f2 = 1;//n=1 and n=2
        int sum = f1 + f2; // 初始化前两个数的和
        for(int i = 3; i <= 40; i++){ // 从第3个数开始计算
            int next = f1 + f2;
            sum += next;
            f1 = f2;
            f2 = next;
        }
        System.out.println("和为：" + sum);
    }
}
