import java.util.List;

class InputParser {

    String[] compartmentaliseInput(String input) {
        return input.split("\\n");
    }

    String getGridSize(String[] compartments) {
        return compartments[0];
    }

    Coordinates getUpperRightEdge(String input) {
        String gridSize = getGridSize(compartmentaliseInput(input));
        String[] rawCoordinates = gridSize.split(" ");
        return new Coordinates(Integer.parseInt(rawCoordinates[0]), Integer.parseInt(rawCoordinates[1]));
    }

    int getFleetSize(String input) {
        return (compartmentaliseInput(input).length - 1) / 2;
    }

    List<Position> getInitialPositions(String input) {
        return null;
    }

    List<String> getCommandSeries(String input) {
        return null;
    }
}
