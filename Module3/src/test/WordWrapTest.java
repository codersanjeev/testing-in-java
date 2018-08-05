package test;

import com.company.WordWrap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordWrapTest {
    public static final int LINE_LENGTH = 5;

    /**
     * A method that breaks words on the specific space with new line,
     * like a word processor would
     */

    @Test
    public void lineShouldWrapIfOverLineLength(){
        String result = WordWrap.wrap("The Sleepy", LINE_LENGTH);
        assertEquals("The S\nleepy", result);
    }

    @Test
    public void shortLinesShouldNotWrap(){
        String result = WordWrap.wrap("The", LINE_LENGTH);
        assertEquals("The", result);
    }

    @Test
    public void longerLineShouldWrapTwice(){
        String result = WordWrap.wrap("The Sleepy Brow", LINE_LENGTH);
        assertEquals("The S\nleepy\n Brow", result);
    }

    @Test
    public void evenLongerLinesShouldWrapThrice(){
        String result = WordWrap.wrap("The Sleepy Brown Fox", LINE_LENGTH);
        assertEquals("The S\nleepy\n Brow\nn Fox", result);
    }

    @Test
    public void longLinesDontHaveToBeAMultipleOfLineLength(){
        String result = WordWrap.wrap("The Sleepy Brown Fox.", LINE_LENGTH);
        assertEquals("The S\nleepy\n Brow\nn Fox\n.", result);
    }
}
