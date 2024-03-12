public class Animal {
    private String name;

    private int age;

    public Animal(String n) {
        name = n;
    }

    public Animal() {
        System.out.println("called");
    }

    public void meow() {
        System.out.println("meow");
    }

    public void changeNameOfAnimal(String n) {
        name = n;
    }

    public void getName() {
        System.out.println(name);
    }

    public String toString() {
        return "this is animal" + name;
    }

    public boolean compareAge(Animal other) {
        return other.age == this.age;
    }

}
