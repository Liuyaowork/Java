import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int [] a1 = {0, 0, 2, 5};
        float [] a = new float[16];
        float sum = 0;
        int i;
        for (i = 1; i < a1.length; i++) {
            a[i] = a1[i];
        }
        for (i = a1.length; i < a.length; i++) {
            a[i] = a[i-1] + a[i-2] + a[i-3] + a[i-4];
            sum += a[i];
        }
        System.out.println("前20项的和为: " + sum);
    }
}
