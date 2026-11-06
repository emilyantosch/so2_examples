/*
 * Lecture 5 – Exercise: Jason the Cat (slides_005/main.typ:516)
 * Question: Which methods does jason: Cat have? Which defining class?
 *   Mammal: breathe(), sleep(), eat()  <-  Carnivore: eat()  <-  Cat: sleep(), hunt(), purr()
 */
package lecture05;

public class Ex18_JasonTheCat {

    static class Mammal {
        public void breathe() { System.out.println("breathe() from Mammal"); }
        public void sleep()   { System.out.println("sleep() from Mammal"); }
        public void eat()     { System.out.println("eat() from Mammal"); }
    }

    static class Carnivore extends Mammal {
        @Override
        public void eat()     { System.out.println("eat() from Carnivore"); }
    }

    static class Cat extends Carnivore {
        @Override
        public void sleep()   { System.out.println("sleep() from Cat"); }
        public void hunt()    { System.out.println("hunt() from Cat"); }
        public void purr()    { System.out.println("purr() from Cat"); }
    }

    public static void main(String[] args) {
        Cat jason = new Cat();
        jason.breathe();
        jason.eat();
        jason.sleep();
        jason.hunt();
        jason.purr();
    }
}

// Answer:
// breathe() -> Mammal
// eat()     -> Carnivore
// sleep()   -> Cat
// hunt()    -> Cat
// purr()    -> Cat
