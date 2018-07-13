import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class MarsRoverShould {

    @Test
    public void exposeInitialHeading() {
        assertThat(new Rover(heading).getHeading).isEqualTo("N");
    }
}
