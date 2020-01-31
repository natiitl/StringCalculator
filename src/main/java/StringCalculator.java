    public class StringCalculator {
        public String add (String numbers) {
            if (numbers == "") {
                return "0";
            }
            if (!numbers.contains(",")) {
                return numbers;
            }
            String[] numberList = numbers.split(",");
            int result = 0;
            for (String element : numberList) {
                result += Integer.parseInt(element);
            }
            return String.valueOf(result);
        }
    }
