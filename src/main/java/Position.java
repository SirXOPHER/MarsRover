class Position {

    private int[] location;
    private String heading;

    Position(int[] location, String heading) {
        this.location = location;
        this.heading = heading;
    }

    int[] getLocation() {
        return location;
    }

//    public void setLocation(int[] location) {
//        this.location = location;
//    }

    String getHeading() {
        return heading;
    }

//    public void setHeading(String heading) {
//        this.heading = heading;
//    }
}