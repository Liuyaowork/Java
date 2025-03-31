public class App {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        for(int i = 0; i <= 599; i++){
            int a = i / 100;
            int b = (i % 100) / 10;
            int c = i % 10;
            if (a == 5 || b == 5 || c == 5){ 
                sum += 1;
            }
        }
        System.out.println("600以内含5的整数个数: " + sum);
    }
}
