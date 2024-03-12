public class Cat extends Animal {
    private int age;

    private String name;

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

    public String toString() {
        return "This is cat" + age;
    }

    public void changeName(String n) {
        super.changeNameOfAnimal(n);
    }



}
