import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Cat tiger = new Cat("tiger", 4);

        Cat tigerTwo = new Cat("tigerTwo", 4);

        Animal testCase = new Animal();

        tiger.getName();

        tiger.meow();

        Animal cat = new Animal("wow");

        cat.meow();

        Animal c = new Cat("testCat", 1);

        System.out.println(tiger);
        System.out.println(cat);
        System.out.println(c);

        System.out.println(tiger.compareAge(tigerTwo));

        Animal[] animalsOne = new Animal[] {new Animal("helloWorld"), new Animal("holmer"), tigerTwo};

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("hey"));
        animals.add(tiger);

        System.out.println(cat.equals(testCase));
        System.out.println(cat.toString());

        c.makeNoise();



    }
}
