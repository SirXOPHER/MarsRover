public class Rover {

    private int[] location;
    private String heading;

    public Rover(int[] location, String heading) {
        this.location = location;
        this.heading = heading;
    }

    public String getHeading() {
        return this.heading;
    }

    public int[] getLocation() {
        return location;
    }
}
