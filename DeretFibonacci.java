import java.util.Scanner;

public class DeretFibonacci {
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah deret Fibonacci : ");
        int n = input.nextInt();

        int total = 0;
        System.out.print("Deret Fibonacci : ");
        for (int i = 0; i < n; i++) {
            int f = fibonacci(i);
            total += f;
            System.out.print(f);
            if (i < n - 1)
                System.out.print(" + ");
        }
        System.out.println(" = " + total);
        input.close();
    }
}
