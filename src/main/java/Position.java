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

    void updateLocation() {
        if (direction == Heading.NORTH) {
            location.setyCoordinate(location.getyCoordinate() + 1);
        }
    }
}
