public class Cat extends Animal {
    private int age;

    public Cat(String n, int a) {
        super(n);
        System.out.println("cat called");
        age = a;
        Animal anim = new Animal();
    }

    public void meow() {
        super.meow();
        System.out.println("roar");
    }

    public void getName() {
        super.getName();
    }
}
