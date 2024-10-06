import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) throws IOException {
        int X = in.nextInt();
        int A = in.nextInt(), B = in.nextInt(), C = in.nextInt(), D = in.nextInt();
        int cnt1 = 1, cnt2 = 1;
        if (A <= X) {
            cnt1++;
            if (B <= X) {
                cnt1++;
                if (C <= X) {
                    cnt1++;
                    if (D <= X)
                        cnt1++;

                }
            }
        }
        if (D <= X) {
            cnt2++;
            if (C <= X) {
                cnt2++;
                if (B <= X) {
                    cnt2++;
                    if (A <= X)
                        cnt2++;
                }
            }
        }
        out.print(cnt1 + " " + cnt2);
    }
}