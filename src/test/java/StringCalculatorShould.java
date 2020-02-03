import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {

    @Test
    public void return_zero_when_string_is_empty(){

        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("0",stringCalculator.add(""));

    }

    @Test
    public void return_one_when_string_have_one(){

        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("1",stringCalculator.add("1"));

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

    @Test
    public void return_four_when_string_have_one_and_three(){

        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("4",stringCalculator.add("1,3"));

    }

    @Test
    public void return_result_when_string_have_one_float_number(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("2.1",stringCalculator.add("1,1.1"));
    }
    @Test
    public void return_result_when_string_have_two_float_numbers(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("2.21",stringCalculator.add("1.11,1.1"));
    }

    @Test
    public void return_result_when_string_have_three_numbers(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("3",stringCalculator.add("1,1,1"));
    }
    @Test
    public void return_result_when_string_have_many_numbers(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("75.31",stringCalculator.add("1,1.1,1,1.11,70,1.1"));
    }

    @Test
    public void return_result_when_string_have_enter_and_comma(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("6", stringCalculator.add("1\n2,3"));
    }

    @Test
    public void return_error_message_when_string_have_two_separators_together(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("Number expected but '\\n' found at position 6.", stringCalculator.add("175.2,\n35"));
    }
    @Test
    public void return_error_message_when_last_character_is_not_number(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("Number expected but EOF found.", stringCalculator.add("1,3,"));
    }
    @Test
    public void return_result_when_separator_is_custom_separator(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals( "3" , stringCalculator.add("//;\n1;2"));
    }
    @Test
    public void return_result_when_separator_is_pipe(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals("6", stringCalculator.add("//|\n1|2|3"));
    }





}
