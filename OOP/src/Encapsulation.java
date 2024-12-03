public class Encapsulation {
    private int id;
    private String name;
    private int age;

    // Parameterized Constructor
    public Encapsulation(int objId, String objName, int objAge) {
        System.out.println("Parameterized Ctor Called");
        this.id = objId;
        this.name = objName;
        this.age = objAge;
    }

    // Getter Method
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // Setter Method
    public void setId(int newId) {
        this.id = newId;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void code() {
        System.out.println(name + " Coding");
    }
}