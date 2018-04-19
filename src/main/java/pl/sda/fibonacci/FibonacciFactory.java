package pl.sda.fibonacci;

public class FibonacciFactory {
    public Fibonacci produce(FibonacciType type) {
        if (type.equals(FibonacciType.ITERATIVE)) {
            return new FibonacciIterational();
        } else if (type.equals(FibonacciType.RECURSIVE)) {
            return new FibonacciRecursive();
        }
        return null;
    }
}
