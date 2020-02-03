import java.text.DecimalFormat;

public class StringCalculator {
        public String add (String numbers) {

            if (numbers == "") {
                return "0";
            }

            if (!numbers.contains(",") && !numbers.contains("\n")) {
                return numbers;
            }

            if(numbers.charAt(numbers.length()-1) == ','){
                return "Number expected but EOF found.";
            }

            if(numbers.indexOf(",\n") != -1){

                return "Number expected but '\\n' found at position " + numbers.indexOf("\n") + ".";
            }
            String[] numberList = numbers.split(",|\\n");

            float result = 0;
            for (String element : numberList) {
                result += Float.parseFloat(element);
            }
            DecimalFormat format = new DecimalFormat("0.##");
            return format.format(result).replace(',','.');
        }
    }
