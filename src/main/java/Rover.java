class Rover {

    private Position position;

    Rover(int[] location, Heading heading) {
        this.position = new Position(location, heading);
    }

    Heading getHeading() {
        return this.position.getHeading();
    }

    int[] getLocation() {
        return position.getLocation();
    }

    void turnLeft() {
        position.headLeft();
    }

    void turnRight() {
        position.headRight();
    }
}
