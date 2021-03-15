import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator(5,3);
    }

    @Test
    public void hasValue1(){
        assertEquals(5, calculator.getValue1());
    }

    @Test
    public void hasValue2(){
        assertEquals(3, calculator.getValue2());
    }

    @Test
    public void canAdd(){
        assertEquals(8, calculator.add());
    }

    @Test
    public void canSubtract() {
        assertEquals(2, calculator.subtract());
    }
}
