class Coordinates {

    private int xCoordinate;
    private int yCoordinate;

    Coordinates(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    int getxCoordinate() {
        return xCoordinate;
    }

    void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    int getyCoordinate() {
        return yCoordinate;
    }

    void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates that = (Coordinates) o;

        return xCoordinate == that.xCoordinate && yCoordinate == that.yCoordinate;
    }

    @Override
    public int hashCode() {
        int result = xCoordinate;
        result = 31 * result + yCoordinate;
        return result;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}
