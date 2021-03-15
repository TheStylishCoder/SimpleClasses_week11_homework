import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before() {
        printer = new Printer(15, 50);
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

    @Test
    public void hasToner(){
        assertEquals(50, printer.getToner());
    }

    @Test
    public void printsAsEnoughPaperAndToner(){
        assertEquals(true, printer.print(4, 2));
        assertEquals(42, printer.getToner());
        assertEquals(7, printer.getNumberOfSheets());
    }

    @Test
    public void doesNotPrintAsNotEnoughTonerOrPaper(){
        assertEquals(false, printer.print(20, 3));
        assertEquals(50, printer.getToner());
        assertEquals(15, printer.getNumberOfSheets());
    }

    @Test
    public void doesNotPrintAsEnoughTonerButNotEnoughPaper(){
        assertEquals(false, printer.print(5, 4));
        assertEquals(50, printer.getToner());
        assertEquals(15, printer.getNumberOfSheets());
    }

    @Test
    public void doesNotPrintAsEnoughPaperButNotEnoughToner(){
        Printer lowTonerPrinter = new Printer(40, 5);
        assertEquals(false, printer.print(4, 5));
        assertEquals(5, lowTonerPrinter.getToner());
        assertEquals(40, lowTonerPrinter.getNumberOfSheets());
    }
}
