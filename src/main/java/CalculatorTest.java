import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator(6,3);
    }

    @Test
    public void hasValue1(){
        assertEquals(6, calculator.getValue1());
    }

    @Test
    public void hasValue2(){
        assertEquals(3, calculator.getValue2());
    }

    @Test
    public void canAdd(){
        assertEquals(9, calculator.add());
    }

    @Test
    public void canSubtract() {
        assertEquals(3, calculator.subtract());
    }

    @Test
    public void canMultiply() {
        assertEquals(18, calculator.multiply());
    }

    @Test
    public void canDivide() {
        assertEquals(2, calculator.divide(), 0.0);
    }
}
