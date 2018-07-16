class InputParser {

    String[] compartmentalise(String input) {
        return input.split("\\n");
    }

    String scanForGridSize(String[] compartments) {
        return compartments[0];
    }

    Coordinates getUpperRightEdge(String input) {
        return null;
    }
}
