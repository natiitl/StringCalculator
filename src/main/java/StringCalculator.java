import java.text.DecimalFormat;

public class StringCalculator {
        public String add (String numbers) {
            if (numbers == "") {
                return "0";
            }
            if (!numbers.contains(",")) {
                return numbers;
            }
            String[] numberList = numbers.split(",");
            float result = 0;
            for (String element : numberList) {
                result += Float.parseFloat(element);
            }
            DecimalFormat format = new DecimalFormat("0.##");
            return format.format(result).replace(',','.');
        }
    }
