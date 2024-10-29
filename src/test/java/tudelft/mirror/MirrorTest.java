package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    private Mirror mirror;

    @BeforeEach
    public void Initialize() {
        mirror = new Mirror();
    }

    @Test
    public void noMirrorableEnds() {
        String noMirrorableEnds = "mirror";

        String actual = mirror.mirrorEnds(noMirrorableEnds);

        String expected = "";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void evenLengthWithMirrorableEnds() {
        String evenLengthWithMirrorableEnds = "abcDEFGcba";

        String actual = mirror.mirrorEnds(evenLengthWithMirrorableEnds);

        String expected = "abc";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void unevenLengthWithMirrorableEnds() {
        String unevenLengthWithMirrorableEnds = "abcDEFcba";

        String actual = mirror.mirrorEnds(unevenLengthWithMirrorableEnds);

        String expected = "abc";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void evenLengthWithOverlappingMirrorableEnds() {
        String evenLengthWithOverlappingMirrorableEnds = "abba";

        String actual = mirror.mirrorEnds(evenLengthWithOverlappingMirrorableEnds);

        String expected = "abba";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void unevenLengthWithOverlappingMirrorableEnds() {
        String unevenLengthWithOverlappingMirrorableEnds = "abbba";

        String actual = mirror.mirrorEnds(unevenLengthWithOverlappingMirrorableEnds);

        String expected = "abbba";
        Assertions.assertEquals(expected, actual);
    }
}
