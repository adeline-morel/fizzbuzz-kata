package fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz",
            "5, Buzz",
            "6, Fizz",
            "10, Buzz",
            "15, FizzBuzz"
    })
    void shouldConvert(int input, String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz(input);
        assertThat(fizzBuzz.convert()).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz",
            "5, Buzz",
            "6, Fizz",
            "10, Buzz",
            "15, FizzBuzz",
            "33, Fizz",
            "45, FizzBuzz"
    })
    void shouldConvertWithoutModuloBecauseWhyNot(int input, String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz(input);
        assertThat(fizzBuzz.convertWithoutModulo()).isEqualTo(expected);
    }
}
