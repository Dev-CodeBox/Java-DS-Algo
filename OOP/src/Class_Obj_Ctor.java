public class Class_Obj_Ctor {
    public int id;
    public String name;
    public int age;

    // Default Constructor
    public Class_Obj_Ctor() {
        System.out.println("Default Ctor Called");
    }

    // Parameterized Constructor
    public Class_Obj_Ctor(int objId, String objName, int objAge) {
        System.out.println("Parameterized Ctor Called");
        this.id = objId;
        this.name = objName;
        this.age = objAge;
    }

    // Copy Constructor
    public Class_Obj_Ctor(Class_Obj_Ctor srcObj) {
        System.out.println("Copy Ctor Called");
        this.id = srcObj.id;
        this.name = srcObj.name;
        this.age = srcObj.age;
    }

    public void code() {
        System.out.println(name + " Coding");
    }
}