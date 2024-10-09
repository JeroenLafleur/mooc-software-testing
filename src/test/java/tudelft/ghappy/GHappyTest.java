package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    private GHappy gHappy;

    @BeforeEach
    public void initialize() {
        this.gHappy = new GHappy();
    }

    @ParameterizedTest(name = "str={0}, expected={1}")
    @CsvSource({"g, false", "xgx, false", "xgxgx, false"})
    public void gWithoutNeigbbours(String str, boolean expected) {
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "str={0}, expected={1}")
    @CsvSource({"ggxx, true", "xxgg, true", "xggxgx, false"})
    public void singleGWithNeigbours(String str, boolean expected) {
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "str={0}, expected={1}")
    @CsvSource({"ggxxgg, true", "xxggxxggxx, true", "xggxgxgg, false"})
    public void multipleGWithNeigbours(String str, boolean expected) {
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "str={0}, expected={1}")
    @CsvSource({",false", "@!, false", "2312, false"})
    public void incorrectInput(String str, boolean expected) {
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(expected, result);
    }
}
