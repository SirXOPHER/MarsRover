class InputParser {

    String[] compartmentalise(String input) {
        return input.split("\\n");
    }

    String scanForGridSize(String[] compartments) {
        return compartments[0];
    }

    Coordinates getUpperRightEdge(String input) {
        String gridSize = scanForGridSize(compartmentalise(input));
        String[] rawCoordinates = gridSize.split(" ");
        return new Coordinates(Integer.parseInt(rawCoordinates[0]), Integer.parseInt(rawCoordinates[1]));
    }

    public int getFleetSize(String input) {
        return 0;
    }
}
