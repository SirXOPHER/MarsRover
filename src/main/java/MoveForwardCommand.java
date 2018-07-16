public class MoveForwardCommand implements Command {

    private Rover rover;
    private Coordinates upperRightEdge;

    MoveForwardCommand(Rover rover, Coordinates upperRightEdge) {
        this.rover = rover;
        this.upperRightEdge = upperRightEdge;
    }

    @Override
    public void execute() {
        rover.move(upperRightEdge);
    }
}
