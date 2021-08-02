public class Test {
    final private int number;

    public Test (int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getNumberFrom(Test object) {
        return object.getNumber();
    }
}

final class TestDriver {
    public static void main(String[] args) {
        var obj1 = new Test(5);
        var obj2 = new Test(6);
        var num = obj2.getNumberFrom(obj1) * obj1.getNumberFrom(obj2);
        System.out.println(num);
    }
}
