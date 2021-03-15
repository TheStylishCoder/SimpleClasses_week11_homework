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

    //original test then modified below
//    @Test
//    public void printsAsEnoughPaper(){
//        printer.print(4,2);
//        assertEquals(7, printer.getNumberOfSheets());
//    }
    @Test
    public void printsAsEnoughPaper(){
        assertEquals(true, printer.print(4, 2));
        assertEquals(7, printer.getNumberOfSheets());
    }


    //original test then modified below
//    @Test
//    public void doesNotPrintAsNotEnoughPaper(){
//        printer.print(5, 4);
//        assertEquals(15, printer.getNumberOfSheets());
//    }

    @Test
    public void doesNotPrintAsNotEnoughPaper(){
        assertEquals(false, printer.print(5, 4));
        assertEquals(15, printer.getNumberOfSheets());
    }
}
