import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class MarsRoverShould {

    private Rover rover;

    @Before
    public void setUp() throws Exception {
        rover = new Rover(new Coordinates(1, 2), Heading.NORTH);
    }

    @Test
    public void exposeInitialHeading() {
        assertThat(rover.getHeading()).isEqualTo(Heading.NORTH);
    }

    @Test
    public void exposeInitialLocation() {
        assertThat(rover.getLocation()).isEqualTo(new Coordinates(1, 2));
    }

    @Test
    public void turnLeftOnce() {
        rover.turnLeft();

        assertThat(rover.getHeading()).isEqualTo(Heading.WEST);
    }

    @Test
    public void turnLeftTwice() {
        rover.turnLeft();
        rover.turnLeft();

        assertThat(rover.getHeading()).isEqualTo(Heading.SOUTH);
    }

    @Test
    @Parameters({"1, WEST", "2, SOUTH", "3, EAST", "4, NORTH", "5, WEST"})
    public void turnLeftAsOftenAsDesired(int turns, Heading expected) {
        while (turns-- > 0) {
            rover.turnLeft();
        }
        assertThat(rover.getHeading()).isEqualTo(expected);
    }

    @Test
    @Parameters({"1, EAST", "2, SOUTH", "3, WEST", "4, NORTH", "5, EAST"})
    public void turnRightAsOftenAsDesired(int turns, Heading expected) {
        while (turns-- > 0) {
            rover.turnRight();
        }
        assertThat(rover.getHeading()).isEqualTo(expected);
    }
    
    @Test
    public void moveForwardOneGridPointToNewPosition() {
        rover.move(new Coordinates(5, 5));

        assertThat(rover.getLocation()).isEqualTo(new Coordinates(1, 3));
    }

    @Test
    @Parameters({"0, 1, 3", "1, 2, 2", "2, 1, 1", "3, 0, 2", "4, 1, 3"})
    public void turnAndMoveInAllDirections(int turns, int expected_x, int expected_y) {
        while (turns-- > 0) {
            rover.turnRight();
        }
        rover.move(new Coordinates(5, 5));

        assertThat(rover.getLocation()).isEqualTo(new Coordinates(expected_x, expected_y));
    }
    
    @Test
    public void moveOverEdgeOfGridAndWrapAround() {
        rover.move(new Coordinates(2, 2));

        assertThat(rover.getLocation()).isEqualTo(new Coordinates(1, 1));
    }
}
