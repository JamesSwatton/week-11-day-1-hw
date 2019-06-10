import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100,100);
    }

    @Test
    public void hasNumOfSheets(){
        assertEquals(100, printer.getNumOfSheets());
    }

    @Test
    public void canPrint(){
        printer.print(2, 10);
        assertEquals(80, printer.getNumOfSheets());
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void canReduceTonerWhenPagesPrinted(){
        printer.print(2, 10);
        assertEquals(98, printer.getTonerVolume());
    }
}
