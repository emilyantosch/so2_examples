/*
 * Lecture 1 – Inheritance (slides_001/main.typ:262)
 * Demo: Derive a new class from a base class: reuse its attributes and methods,
 *       then extend it without duplicating code.
 */
package lecture01;

public class Ex03_AnimalInheritance {

    static class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }

        void eat() {
            System.out.println(name + " is eating");
        }
    }

    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }

        void bark() {
            System.out.println(name + ": Woof!");
        }
    }

    static class Cat extends Animal {
        Cat(String name) {
            super(name);
        }

        void meow() {
            System.out.println(name + ": Meow!");
        }
    }

    static class Cow extends Animal {
        Cow(String name) {
            super(name);
        }

        void moo() {
            System.out.println(name + ": Moo!");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Luna");
        Cow cow = new Cow("Berta");

        dog.eat();  // inherited from Animal
        dog.bark();
        cat.eat();
        cat.meow();
        cow.eat();
        cow.moo();
    }
}
