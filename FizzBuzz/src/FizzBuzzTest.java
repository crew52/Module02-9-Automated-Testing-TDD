import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzzTranslate;

    @BeforeEach
    void setUp() {
        fizzBuzzTranslate = new FizzBuzz();
    }

    @Test
    @DisplayName("FizzBuzz: divisible by 3 and 5")
    void testFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzzTranslate.translate(15));
    }

    @Test
    @DisplayName("Fizz: divisible by 3")
    void testFizz() {
        assertEquals("Fizz", fizzBuzzTranslate.translate(9));
    }

    @Test
    @DisplayName("Buzz: divisible by 5")
    void testBuzz() {
        assertEquals("Buzz", fizzBuzzTranslate.translate(10));
    }

    @Test
    @DisplayName("Fizz: contains 3")
    void testFizzContains3() {
        assertEquals("Fizz", fizzBuzzTranslate.translate(31));
    }

    @Test
    @DisplayName("Buzz: contains 5")
    void testBuzzContains5() {
        assertEquals("Buzz", fizzBuzzTranslate.translate(52));
    }

    @Test
    @DisplayName("Number to words: less than 100")
    void testNumberToWords() {
        assertEquals("hai mươi sáu", fizzBuzzTranslate.translate(26));
    }

    @Test
    @DisplayName("Exception: number is 0 or negative")
    void testInvalidNumber() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzzTranslate.translate(0));
        assertThrows(IllegalArgumentException.class, () -> fizzBuzzTranslate.translate(-5));
    }

    @Test
    @DisplayName("Exception: number >= 100")
    void testNumberTooLarge() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzzTranslate.translate(100));
    }
}
