interface Bird {
    void fly();

    void eat();
}

class Eagle implements Bird {
    @Override
    public void fly() {
        System.out.println("Eagle Is Flying Out Of The Cloud.....");
    }

    @Override
    public void eat() {
        System.out.println("Eagle Is Eating Flesh...");
    }
}

public class Interface {
    public static void main(String[] args) {
        // Using Eagle Class
        Eagle obj_Eagle_Bird = new Eagle();
        obj_Eagle_Bird.fly();
        obj_Eagle_Bird.eat();

        doIntfStuff(new Eagle());
    }

    public static void doIntfStuff(Eagle intfStuff) {
        intfStuff.fly();
        intfStuff.eat();
    }
}
