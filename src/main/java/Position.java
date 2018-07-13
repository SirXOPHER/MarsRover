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

    public void setHeading(Heading heading) {
        this.heading = heading;
    }
}