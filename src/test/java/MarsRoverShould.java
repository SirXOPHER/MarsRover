import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class MarsRoverShould {

    private Rover rover;

    @Before
    public void setUp() throws Exception {
        rover = new Rover(new int[]{1, 2}, Heading.NORTH);
    }

    @Test
    public void exposeInitialHeading() {
        assertThat(rover.getHeading()).isEqualTo(Heading.NORTH);
    }

    @Test
    public void exposeInitialLocation() {
        assertThat(rover.getLocation()).isEqualTo(new int[] {1,2});
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
}
