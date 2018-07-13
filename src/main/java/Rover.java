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
        if (position.getHeading() == Heading.NORTH) {
            position.setHeading(Heading.WEST);
            return;
        }
        if (position.getHeading() == Heading.WEST) {
            position.setHeading(Heading.SOUTH);
        }
    }
}
