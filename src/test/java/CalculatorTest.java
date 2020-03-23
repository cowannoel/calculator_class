import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
       calculator = new Calculator();
    }

    @Test
    public void add(){
    assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void subtract(){
        assertEquals(50, calculator.subtract(100, 50));
    }

    @Test
    public void multiply(){
        assertEquals(100, calculator.multiply(10, 10));
    }

    @Test
    public void divide(){
        assertEquals(5, calculator.divide(10, 2), 0.01);
    }

}
