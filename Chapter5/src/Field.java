public class Field {
    Apple a1 = new Apple();
    Apple a2 = new Apple();

    public void setupApples() {
        a1.diameter = 3.0;
        a1.mass = 5.0;
        a1.x = 20;
        a1.y = 40;
        a2.diameter = 8.0;
        a2.mass = 10.0;
        a2.x = 21;
        a2.y = 41;
    }

    public void detectCollision() {
        System.out.println(a1.isTouching(a2) ? "Collision detected!" : "Apple aren't touching.");
    }
}
