package demo.shikhin.junittesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 7/7/2016.
 */
public class CalculatorTest {

    private Calculator cal;

    @Before
    public void setUp() throws Exception {
        cal = new Calculator();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(6d, cal.sum(1d, 5d), 0);
    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals(1d, cal.sum(6d, 5d), 0);
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(10d, cal.sum(2d, 5d), 0);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(4d, cal.sum(20d, 5d), 0);
    }
}