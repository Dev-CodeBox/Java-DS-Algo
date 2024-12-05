abstract class Bird {
    abstract void fly();

    abstract void eat();
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle Is Flying Out Of The Cloud.....");
    }

    @Override
    public void eat() {
        System.out.println("Eagle Is Eating Flesh...");
    }
}

class Vulter extends Bird {
    @Override
    public void fly() {
        System.out.println("Vulter Is Flying.....");
    }

    @Override
    public void eat() {
        System.out.println("Vulter Is Eating Dead Animal's Flesh...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Using Eagle Class
        Bird obj_Eagle_Bird = new Eagle();
        obj_Eagle_Bird.fly();
        obj_Eagle_Bird.eat();

        // Using Vulter Class
        Bird obj_Vulter_Bird = new Vulter();
        obj_Vulter_Bird.fly();
        obj_Vulter_Bird.eat();

        doAbsStuff(new Eagle());
        doAbsStuff(new Vulter());
    }

    public static void doAbsStuff(Bird absStuff) {
        absStuff.fly();
        absStuff.eat();
    }
}