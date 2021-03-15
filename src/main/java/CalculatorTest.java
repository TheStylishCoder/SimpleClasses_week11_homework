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
}
