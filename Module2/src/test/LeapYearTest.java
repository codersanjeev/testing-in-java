package test;

import com.company.LeapYear;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeapYearTest {

    /**
     * A year is a leap year if it is divisible by 4
     * but, years divisible by 100 are not leap years
     * except, years divisible by 400
     */

    @Test
    public void leapYearsAreDivisibleByFour(){
        assertTrue(LeapYear.isLeapYear(2020));
    }

    @Test
    public void normalYearsAreNotDivisibleByFour(){
        assertFalse(LeapYear.isLeapYear(2017));
    }

    @Test
    public void leapYearsAreNotDivisibleByOneHundred(){
        assertFalse(LeapYear.isLeapYear(1900));
    }

    @Test
    public void leapYearsAreDivisibleByFourHundred(){
        assertTrue(LeapYear.isLeapYear(2000));
    }

}
