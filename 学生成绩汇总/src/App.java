import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int[][] s = new int[6][5];
        float sum;
        int i, j, MAX;
        Scanner sc = new Scanner(System.in);
        System.out.println("依次输入学号，数学，语文，英语成绩: ");
        for (i = 0; i < s.length - 1; i++) {
            for (j = 0; j < s[i].length - 1; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        // 计算平均成绩        
        for (i = 0; i < s.length - 1; i++) {
            sum = 0;
            for (j = 1; j < s[i].length - 1; j++) {
                sum += s[i][j];
            }
            s[i][j] = (int) (sum / 3);
        }
        // 计算各科目最高分
        for (j = 1; j < s[0].length - 1; j++) {
            MAX = s[0][j];
            for (i = 0; i < s.length - 1; i++) {
                if (s[i][j] > MAX)
                    MAX = s[i][j];
            }
            s[s.length - 1][j] = MAX;
        }
        // 输出成绩表
        System.out.println("学号\t数学\t语文\t英语\t平均成绩");
        for (i = 0; i < s.length - 1; i++) {
            for (j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }
        // 输出各科目最高分
        System.out.println("各科目最高分\t数学\t语文\t英语");
        System.out.print("\t\t");
        for (j = 1; j < s[0].length - 1; j++) {
            System.out.print(s[s.length - 1][j] + "\t");
        }
        System.out.println();
    }
}