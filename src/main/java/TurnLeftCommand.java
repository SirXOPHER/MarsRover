public class TurnLeftCommand implements Command {

    private Rover rover;

    TurnLeftCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnLeft();
    }
}
