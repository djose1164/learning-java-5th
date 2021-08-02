public class Apple {
    double mass;
    double diameter = 1;
    int x, y;
    static double gravAccel = 9.8;
    static final double EARTH_ACCEL = 9.8;
    static int SMALL = 0, MEDIUM = 1, LARGE = 2;

    boolean isTouching(Apple other) {
        double xdiff = x - other.x;
        double ydiff = y - other.y;
        double distance = Math.sqrt(Math.pow(xdiff, 2) + Math.pow(ydiff, 2));
        return distance < diameter / 2 + other.diameter / 2;
    }

    public void printDetails() {
        System.out.println(" mass: " + mass);
        System.out.println(" diameter: " + diameter);
        System.out.println(" position: (" + x + ", " + y + ")");
    }
}
