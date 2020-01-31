import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {

    @Test
    public void return_zero_when_string_is_empty(){

        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("0",stringCalculator.add(""));

    }
    @Test
    public void return_two_when_string_have_two_ones(){

        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("2",stringCalculator.add("1,1"));

    }

    @Test
    public void return_three_when_string_have_one_and_two(){

        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("3",stringCalculator.add("1,2"));

    }

}
