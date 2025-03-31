public class App {
    public static void main(String[] args) throws Exception {
        int i, j, k;
        int number = 10;
        int [][] s = new int [number][];
        for (i = 0; i < number; i++){
            s [i] = new int [i + 1];
            s [i][0] = 1;
            s [i][i] = 1;
            for (j = 1; j < i; j++){
                s [i][j] = s [i - 1][j - 1] + s [i - 1][j];
            }
        }
        for (i = 0; i < number; i ++){
            for (k = 0; k < number - i; k++){
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++){
                System.out.printf("%4d", s [i][j]);
            }
            System.out.println();
        }
    }
}
