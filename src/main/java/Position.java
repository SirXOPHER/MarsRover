class Position {

    private Coordinates location;
    private Heading direction;

    Position(Coordinates location, Heading direction) {
        this.location = location;
        this.direction = direction;
    }

    Coordinates getLocation() {
        return location;
    }

    Heading getDirection() {
        return direction;
    }

    void headLeft() {
        direction = direction.getLeftHeading();
    }

    void headRight() {
        direction = direction.getRightHeading();
    }

    void moveForward() {
        if (direction == Heading.NORTH) {
            location.setyCoordinate(location.getyCoordinate() + 1);
        }
        if (direction == Heading.EAST) {
            location.setxCoordinate(location.getxCoordinate() + 1);
        }
        if (direction == Heading.SOUTH) {
            location.setyCoordinate(location.getyCoordinate() - 1);
        }
        if (direction == Heading.WEST) {
            location.setxCoordinate(location.getxCoordinate() - 1);
        }
    }

    void wrapAround(Coordinates upperRightEdge) {
        if (location.getyCoordinate() > upperRightEdge.getyCoordinate()) {
            location.setyCoordinate(location.getyCoordinate() % upperRightEdge.getyCoordinate());
        }
        if (location.getxCoordinate() > upperRightEdge.getxCoordinate()) {
            location.setxCoordinate(location.getxCoordinate() % upperRightEdge.getxCoordinate());
        }
        if (location.getyCoordinate() < 1) {
            location.setyCoordinate(upperRightEdge.getyCoordinate());
        }
    }
}
