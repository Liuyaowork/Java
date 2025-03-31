public class App {
    public static void main(String[] args) throws Exception {
        float sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum += Math.pow(-1, i) / (2 * i + 1); // 修正公式
        }
        float piApproximation = sum * 4; // 乘以4得到圆周率近似值
        System.out.println("圆周率近似值为：" + piApproximation);
    }
}
