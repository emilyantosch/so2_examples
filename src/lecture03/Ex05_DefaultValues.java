/*
 * Lecture 3 – Initialization (slides_003/main.typ:176)
 * Demo: Default field values — not defaults for local variables.
 */
package lecture03;

public class Ex05_DefaultValues {

    static class Defaults {
        byte b;
        short s;
        int i;
        long l;
        char c;
        float f;
        double d;
        boolean bool;
        String reference;
    }

    public static void main(String[] args) {
        Defaults x = new Defaults();
        System.out.println("byte:    " + x.b);
        System.out.println("short:   " + x.s);
        System.out.println("int:     " + x.i);
        System.out.println("long:    " + x.l);
        System.out.println("char:    " + (int) x.c + " ('\\u0000')");
        System.out.println("float:   " + x.f);
        System.out.println("double:  " + x.d);
        System.out.println("boolean: " + x.bool);
        System.out.println("String:  " + x.reference);
    }
}
