public class Animal {
    private String name;

    public Animal(String n) {
        name = n;
    }

    public Animal() {
        System.out.println("called");
    }

    public void meow() {
        System.out.println("meow");
    }

    public void getName() {
        System.out.println(name);
    }

    public String toString() {
        return "this is animal" + name;
    }

}
