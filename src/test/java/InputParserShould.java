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
        assertThat(parser.compartmentaliseInput(testInput)).isNotEmpty().hasSize(5);
        assertThat(parser.compartmentaliseInput(testInput)).contains("5 5", atIndex(0)).contains("1 2 N", atIndex(1)).contains("LMLMLMLMM", atIndex(2)).contains("3 3 E", atIndex(3)).contains("MMRMMRMRRM", atIndex(4));
    }

    @Test
    public void determineGridSize() {
        assertThat(parser.getGridSize(parser.compartmentaliseInput(testInput))).isEqualTo("5 5");
    }
    
    @Test
    public void convertGridSizeToUpperRightEdge() {
        assertThat(parser.getUpperRightEdge(testInput)).isEqualTo(new Coordinates(5, 5));
    }

    @Test
    public void determineNumberOfRovers() {
        assertThat(parser.getFleetSize(testInput)).isEqualTo(2);
    }
    
    @Test
    public void registerRoverInitialPositions() {
        assertThat(parser.getInitialPositions(testInput)).contains(new Position(new Coordinates(1, 2), Heading.NORTH), atIndex(0)).contains(new Position(new Coordinates(3, 3), Heading.EAST), atIndex(1));
    }

    @Test
    public void registerRoverCommandSeries() {
        assertThat(parser.getCommandSeries(testInput)).contains("LMLMLMLMM", atIndex(0)).contains("MMRMMRMRRM", atIndex(1));
    }
}
