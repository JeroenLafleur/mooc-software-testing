package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher ceasarShiftCipher;

    @BeforeEach
    public void initialize() {
        ceasarShiftCipher = new CaesarShiftCipher();
    }

    @ParameterizedTest(name = "message={0}, shift={1}, expected={2}")
    @CsvSource({"xyz,-3,uvw", "qrs,3,tuv"})
    public void shiftInCurrentRange(String message, int shift, String expected) {
        String result = ceasarShiftCipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "message={0}, shift={1}, expected={2}")
    @CsvSource({"xyz,-29,uvw", "qrs,29,tuv"})
    public void shiftOutsideCurrentRange(String message, int shift, String expected) {
        String result = ceasarShiftCipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "message={0}, shift={1}, expected={2}")
    @CsvSource({"123,1,invalid", "@#$,1,invalid", ",1,invalid"})
    public void invalidMessage(String message, int shift, String expected) {
        String result = ceasarShiftCipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }
}
