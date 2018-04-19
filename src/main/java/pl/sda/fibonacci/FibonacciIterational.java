package pl.sda.fibonacci;

import java.math.BigDecimal;

public class FibonacciIterational implements Fibonacci{

    @Override
    public BigDecimal getN(int n) {
        BigDecimal first = new BigDecimal(1);
        BigDecimal result = new BigDecimal(0);

        for (int i = 1; i <= n; i++) {
            BigDecimal tmp = result;
            result = result.add(first);
            first = tmp;
        }
        return result;
    }
}
