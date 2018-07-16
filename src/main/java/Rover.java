class Rover {

    private Position position;

    Rover(Coordinates location, Heading direction) {
        this.position = new Position(location, direction);
    }

    Heading getHeading() {
        return this.position.getDirection();
    }

    Coordinates getLocation() {
        return position.getLocation();
    }

    void turnLeft() {
        position.headLeft();
    }

    void turnRight() {
        position.headRight();
    }

    void move(Coordinates upperRightEdge) {
        position.moveForward();
        position.wrapAround(upperRightEdge);
    }
}
