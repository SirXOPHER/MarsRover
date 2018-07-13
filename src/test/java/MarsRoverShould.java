import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class MarsRoverShould {

    private Rover rover;

    @Before
    public void setUp() throws Exception {
        rover = new Rover(new int[]{1, 2}, "N");
    }

    @Test
    public void exposeInitialHeading() {
        assertThat(rover.getHeading()).isEqualTo("N");
    }

    @Test
    public void exposeInitialLocation() {
        assertThat(rover.getLocation()).isEqualTo(new int[] {1,2});
    }
    
    @Test
    public void turnLeft() {
        rover.turnLeft();

        assertThat(rover.getHeading()).isEqualTo("W");
    }
}
