import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(5.0, calculator.add(2.0,3.0), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtract(6,3), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(25, calculator.multiply(5,5), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(4, calculator.divide(12,3), 0.01);
    }
}
