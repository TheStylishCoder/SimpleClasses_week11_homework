import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before() {
        printer = new Printer(15);
    }

    @Test
    public void hasPaper(){
        assertEquals(15, printer.getNumberOfSheets());
    }
}
