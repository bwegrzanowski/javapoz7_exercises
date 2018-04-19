package pl.sda.fibonacci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class FibonacciGeneratorTest {
    private FibonacciGenerator generator;

    @Before
    public void init() {
        this.generator = new FibonacciGenerator();
    }

    @Test
    public void testGenerateRecursiveSolution() {
        //when
        BigDecimal recursiveResult = generator.generate(FibonacciType.RECURSIVE, 10);

        //then
        Assert.assertEquals(recursiveResult, new BigDecimal(55));
    }

    @Test
    public void testGenerateIterativeSolution() {
        //when
        BigDecimal iterativeResult = generator.generate(FibonacciType.ITERATIVE, 10);

        //Then
        Assert.assertEquals(iterativeResult, new BigDecimal(55));
    }
}
