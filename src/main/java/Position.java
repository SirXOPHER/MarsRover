class Position {

    private int[] location;
    private Heading heading;

    Position(int[] location, Heading heading) {
        this.location = location;
        this.heading = heading;
    }

    int[] getLocation() {
        return location;
    }

//    public void setLocation(int[] location) {
//        this.location = location;
//    }

    Heading getHeading() {
        return heading;
    }

    void setHeading(Heading heading) {
        this.heading = heading;
    }

    void headLeft() {
        heading = heading.getLeftHeading();
    }

    void headRight() {
        heading = heading.getRightHeading();
    }
}