import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    @Test
    public void yearDevidbleWith4AndNot100IsLeapYear(){
        assertTrue(Year.isLeapYear(2004));
        assertTrue(Year.isLeapYear(2024));
    }

    @Test
    public void yearDevidbleWith400IsLeapyear(){
        assertTrue(Year.isLeapYear(2000));
        assertTrue(Year.isLeapYear(4000));
    }

}

