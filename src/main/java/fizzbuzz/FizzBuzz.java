package fizzbuzz;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private final int entry;

    public FizzBuzz(int entry) {
        this.entry = entry;
    }

    String convert() {
        if(isMultipleOf3And5()) {
            return FIZZ+BUZZ;
        }
        if(isMultipleOf3()) {
            return FIZZ;
        }
        if(isMultipleOf5()) {
            return BUZZ;
        }
        return String.valueOf(entry);
    }

    private boolean isMultipleOf3And5() {
        return isMultipleOf3() && isMultipleOf5();
    }

    private boolean isMultipleOf5() {
        return entry % 5 == 0;
    }

    private boolean isMultipleOf3() {
        return entry % 3 == 0;
    }

    public String convertWithoutModulo() {
        if(isMultipleOf3And5WithoutModulo()) {
            return FIZZ+BUZZ;
        }
        if(isMultipleOf3WithoutModulo()) {
            return FIZZ;
        }
        if(isMultipleOf5WithoutModulo()) {
            return BUZZ;
        }
        return String.valueOf(entry);
    }

    private boolean isMultipleOf3And5WithoutModulo() {
        return isMultipleOf3WithoutModulo() && isMultipleOf5WithoutModulo();
    }

    private boolean isMultipleOf3WithoutModulo() {
        int sum = String.valueOf(entry)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        return sum == 3 || sum == 6 || sum == 9;
    }

    private boolean isMultipleOf5WithoutModulo() {
        String str = String.valueOf(entry);
        char lastDigit = str.charAt(str.length() - 1);
        return lastDigit == '0' || lastDigit == '5';
    }
}
