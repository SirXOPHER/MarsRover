import java.util.ArrayList;
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
        List<Position> result = new ArrayList<>();
        String[] inputArray = compartmentaliseInput(input);
        for (int index = 1; index < inputArray.length; index += 2) {
            String[] inputLine = inputArray[index].split(" ");
            result.add(new Position(new Coordinates(Integer.parseInt(inputLine[0]), Integer.parseInt(inputLine[1])), exposeHeading(inputLine[2])));
        }
        return result;
    }

    private Heading exposeHeading(String inputElement) {
        if (inputElement.equals("N")) {
            return Heading.NORTH;
        }
        if (inputElement.equals("E")) {
            return Heading.EAST;
        }
        if (inputElement.equals("S")) {
            return Heading.SOUTH;
        }
        if (inputElement.equals("W")) {
            return Heading.WEST;
        }
        return null;
    }

    List<String> getCommandSeries(String input) {
        return null;
    }
}
