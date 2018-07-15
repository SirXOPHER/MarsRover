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

//    public void setLocation(int[] location) {
//        this.location = location;
//    }

    Heading getDirection() {
        return direction;
    }

//    void setHeading(Heading direction) {
//        this.direction = direction;
//    }

    void headLeft() {
        direction = direction.getLeftHeading();
    }

    void headRight() {
        direction = direction.getRightHeading();
    }
}
