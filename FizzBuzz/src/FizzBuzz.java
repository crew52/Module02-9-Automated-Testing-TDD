public class FizzBuzz {
    public String translate(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }

        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;
        boolean contains3 = containsDigit(number, 3);
        boolean contains5 = containsDigit(number, 5);

        if (divisibleBy3 && divisibleBy5) {
            return "FizzBuzz";
        }
        if (divisibleBy3 || contains3) {
            return "Fizz";
        }
        if (divisibleBy5 || contains5) {
            return "Buzz";
        }

        return numberToWords(number);
    }

    private boolean containsDigit(int number, int digit) {
        String numStr = String.valueOf(number);
        return numStr.contains(String.valueOf(digit));
    }

    private String numberToWords(int number) {
        if (number >= 100) {
            throw new IllegalArgumentException("Number must be less than 100");
        }

        String[] units = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        if (number < 10) {
            return units[number];
        }

        int tens = number / 10;
        int ones = number % 10;

        String result = units[tens] + " " + units[ones];
        return result.trim();
    }
}
