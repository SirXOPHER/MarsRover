class Rover {

    private Position position;

    Rover(int[] location, String heading) {
        this.position = new Position(location, heading);
    }

    String getHeading() {
        return this.position.getHeading();
    }

    int[] getLocation() {
        return position.getLocation();
    }

    public void turnLeft() {
        this.position.setHeading("W");
    }
}
