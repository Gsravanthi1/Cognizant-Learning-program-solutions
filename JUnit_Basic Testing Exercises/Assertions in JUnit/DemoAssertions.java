public class DemoAssertions {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isGreater(int a, int b) {
        return a > b;
    }

    public boolean isLess(int a, int b) {
        return a < b;
    }

    public Object getNullObject() {
        return null;
    }

    public Object getNonNullObject() {
        return new Object();
    }
}
