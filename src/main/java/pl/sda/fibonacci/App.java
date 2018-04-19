package pl.sda.fibonacci;


import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        int n = 10;

        FibonacciGenerator generator = new FibonacciGenerator();
        BigDecimal result = generator.generate(FibonacciType.ITERATIVE, n);
        System.out.println("WYRAZ NR " + n + " CIĄGU FIBONACCIEGO TO " + result);

    }
}
