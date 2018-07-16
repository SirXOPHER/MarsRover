import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.atIndex;

public class CommandPatternShould {

    private Rover rover;

    @Before
    public void setUp() throws Exception {
        rover = new Rover(new Coordinates(1, 2), Heading.NORTH);
    }

    @Test
    public void executeCommandToTurnLeft() {
        Command turnLeft = new TurnLeftCommand(rover);
        turnLeft.execute();

        assertThat(rover.getHeading()).isEqualTo(Heading.WEST);
    }

    @Test
    public void executeCommandToTurnRight() {
        Command turnRight = new TurnRightCommand(rover);
        turnRight.execute();

        assertThat(rover.getHeading()).isEqualTo(Heading.EAST);
    }

    @Test
    public void executeCommandToMoveForward() {
        Coordinates upperRightEdge = new Coordinates(5, 5);
        Command moveForward = new MoveForwardCommand(rover, upperRightEdge);
        moveForward.execute();

        assertThat(rover.getLocation()).isEqualTo(new Coordinates(1, 3));
    }

    @Test
    public void invokeCommandsFromDedicatedController() {
        Command turnLeft = new TurnLeftCommand(rover);
        Controller controller = new Controller();
        controller.execute(turnLeft);

        assertThat(rover.getHeading()).isEqualTo(Heading.WEST);
    }
    
    @Test
    public void allowToStoreCommandsHistory() {
        Command turnLeft = new TurnLeftCommand(rover);
        Command turnRight = new TurnRightCommand(rover);
        Controller controller = new Controller();
        controller.storeAndExecute(turnLeft);
        controller.storeAndExecute(turnRight);

        assertThat(controller.getHistory()).contains(turnLeft, atIndex(0)).contains(turnRight, atIndex(1));
    }
}
