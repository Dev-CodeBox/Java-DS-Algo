public class Polymorphism extends Encapsulation {
    private String title;

    // Parameterized Constructer
    public Polymorphism(int objId, String objName, int objAge, String objTitle) {
        super(objId, objName, objAge);
        this.title = objTitle;
    }

    // Method Overriding
    @Override
    public void code() {
        System.out.println(title + " Coding");
    }

    // Method Overloading

    // Method To Sum Two Integers
    public int sum(int x, int y) {
        return x + y;
    }

    // Overloaded Method To Sum Three Integers
    public int sum(int x, int y, int z) {
        return x + y + z;
    }
}