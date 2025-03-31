public class App {
    public static void main(String[] args) throws Exception {
        double sum;
        int i;
        for(sum = 0, i = 1; i <= 100; i ++)
            sum += 1.0 / i; 
        System.out.println("和为：" + sum);
    }
}
