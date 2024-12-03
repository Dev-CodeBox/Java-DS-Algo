public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Using Default Constructor
        Class_Obj_Ctor obj_Ctor = new Class_Obj_Ctor();
        obj_Ctor.id = 1;
        obj_Ctor.name = "firstObj";
        obj_Ctor.age = 5;
        System.out.println("ID -> " + obj_Ctor.id);
        System.out.println("Name -> " + obj_Ctor.name);
        System.out.println("Age -> " + obj_Ctor.age);
        obj_Ctor.code();

        // Using Parameterized Constructor
        Class_Obj_Ctor obj_Ctor_Param = new Class_Obj_Ctor(2, "secObj", 5);
        System.out.println("ID -> " + obj_Ctor_Param.id);
        System.out.println("Name -> " + obj_Ctor_Param.name);
        System.out.println("Age -> " + obj_Ctor_Param.age);
        obj_Ctor_Param.code();

        // Using Copy Constructor
        Class_Obj_Ctor obj_Ctor_Copy = new Class_Obj_Ctor(obj_Ctor_Param);
        System.out.println("ID -> " + obj_Ctor_Copy.id);
        System.out.println("Name -> " + obj_Ctor_Copy.name);
        System.out.println("Age -> " + obj_Ctor_Copy.age);
        obj_Ctor_Copy.code();

        // Encapsulation
        Encapsulation obj_Encap = new Encapsulation(1, "encapObj", 5);
        // Using Getter Method
        System.out.println("ID -> " + obj_Encap.getId());
        System.out.println("Name -> " + obj_Encap.getName());
        System.out.println("Age -> " + obj_Encap.getAge());
        obj_Encap.code();

        // Using Setter Method
        obj_Encap.setId(2);
        obj_Encap.setName("setEncapobj");
        obj_Encap.setAge(10);

        // Using Getter Method
        System.out.println("ID -> " + obj_Encap.getId());
        System.out.println("Name -> " + obj_Encap.getName());
        System.out.println("Age -> " + obj_Encap.getAge());
        obj_Encap.code();
    }
}
