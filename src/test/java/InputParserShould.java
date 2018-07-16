import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.atIndex;

public class InputParserShould {

    private String testInput;
    private InputParser parser;

    @Before
    public void setUp() {
        testInput = "5 5\n" +
                "1 2 N\n" +
                "LMLMLMLMM\n" +
                "3 3 E\n" +
                "MMRMMRMRRM";

        parser = new InputParser();
    }

    @Test
    public void compartmentaliseGivenInputForProcessing() {
        assertThat(parser.compartmentalise(testInput)).isNotEmpty().hasSize(5);
        assertThat(parser.compartmentalise(testInput)).contains("5 5", atIndex(0)).contains("1 2 N", atIndex(1)).contains("LMLMLMLMM", atIndex(2)).contains("3 3 E", atIndex(3)).contains("MMRMMRMRRM", atIndex(4));
    }

    @Test
    public void determineGridSize() {
        assertThat(parser.scanForGridSize(parser.compartmentalise(testInput))).isEqualTo("5 5");
    }
}
