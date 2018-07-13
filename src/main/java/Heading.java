public enum Heading {

    NORTH,
    EAST,
    SOUTH,
    WEST;

    private Heading left;
    private Heading right;

    static {
        NORTH.left = WEST;
        EAST.left = NORTH;
        SOUTH.left = EAST;
        WEST.left = SOUTH;

        NORTH.right = EAST;
        EAST.right = SOUTH;
        SOUTH.right = WEST;
        WEST.right = NORTH;
    }

    public Heading getLeftHeading() {
        return left;
    }

    public Heading getRightHeading() {
        return right;
    }
}
