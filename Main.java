public class Main {
    public static void main(String[] args) {
        Cat tiger = new Cat("tiger", 4);

        tiger.getName();

        tiger.meow();

        Animal cat = new Animal("wow");

        cat.meow();

        Animal c = new Cat("testCat", 1);

        System.out.println(tiger);
        System.out.println(cat);
        System.out.println(c);
    }
}
