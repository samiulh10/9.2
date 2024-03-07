public class Cat extends Animal {
    private int age;

    public Cat(String n, int a) {
        super(n);
        age = a;
    }

    public void meow() {
        super.meow();
        System.out.println("roar");
    }
}
