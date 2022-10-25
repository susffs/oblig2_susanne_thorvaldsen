import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotLeapYearTest {

    @Test
    public void number_is_not_dividible_by4() {
        assertFalse(Year.isLeapYear(1997));
        assertFalse(Year.isLeapYear(2001));
    }


    @Test
    public void yearIsDividbleWith100Andnot400(){
        assertFalse(Year.isLeapYear(100));
        assertFalse(Year.isLeapYear(98));
        assertFalse(Year.isLeapYear(1700));
    }


}
