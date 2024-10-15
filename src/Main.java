import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f0 = 1;
        int f1 = 1;
        for (int i = 2; ; i++) {
            int next = f0 + f1;
            f1 = next;
            if (f1 > n) {
                System.out.println("первое число фибоначчи " + n + ": " + f1);
                break;

            }

        }
    }
}

