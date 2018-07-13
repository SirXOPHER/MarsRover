import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class MarsRoverShould {

    @Test
    public void exposeInitialHeading() {
        assertThat(new Rover(new int[]{1, 2}, "N").getHeading()).isEqualTo("N");
    }

    @Test
    public void exposeInitialLocation() {
        assertThat(new Rover(new int[] {1,2}, "N").getLocation()).isEqualTo(new int[] {1,2});
    }
    
    @Test
    public void turnLeft() {
        Rover testRover = new Rover(new int[] {1,2}, "N");
        testRover.turnLeft();

        assertThat(testRover.getHeading()).isEqualTo("W");
    }
}
