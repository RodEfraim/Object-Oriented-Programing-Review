package Animal;

public class TestMammal {

    public static void main(String[] args) {

        // Declare and allocate a new instance of mammal with custom name.
        Animal animal1 = new Animal("Mickey");
        System.out.println("animal1: " + animal1);

        // Declare and allocate a new instance of mammal with custom name.
        Mammal mammal1 = new Mammal("Bob");
        System.out.println("mammal1: " + mammal1);

        // Declare and allocate a new instance of cat with custom name.
        Cat cat1 = new Cat("Herzl");
        System.out.println("cat1: " + cat1);
        cat1.greets();

        // Declare and allocate a new instance of dog with custom name.
        Dog dog1 = new Dog("Scooby");
        System.out.println("dog1: " + dog1);
        dog1.greets();

        Dog dog2 = new Dog("Tyson");
        System.out.println("dog2: " + dog2);
        dog2.greets();
        dog2.greets(dog1);
    }
}
