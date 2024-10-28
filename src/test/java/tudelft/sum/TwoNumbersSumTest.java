package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {
    private TwoNumbersSum twoNumbersSum;

    @BeforeEach
    public void Initialize() {
        twoNumbersSum = new TwoNumbersSum();
    }

    @Test
    public void numberWithoutComplements() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(4,5,6));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1,2,3));

        ArrayList<Integer> actual = twoNumbersSum.addTwoNumbers(first, second);

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5,7,9));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberWithFirstPositionComplement() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(8,2,7));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3,2,2));

        ArrayList<Integer> actual = twoNumbersSum.addTwoNumbers(first, second);

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,1,4,9));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberWithSecondPositionComplement() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(2,9,5));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4,2,2));

        ArrayList<Integer> actual = twoNumbersSum.addTwoNumbers(first, second);

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(7,1,7));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberWithThirdPositionComplement() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(4,2,7));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3,2,5));

        ArrayList<Integer> actual = twoNumbersSum.addTwoNumbers(first, second);

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(7,5,2));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberWithAllComplements() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(8,7,6));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3,4,5));

        ArrayList<Integer> actual = twoNumbersSum.addTwoNumbers(first, second);

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2,2,1));
        Assertions.assertEquals(expected, actual);
    }
}
