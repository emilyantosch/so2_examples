/*
 * Lecture 1 – Applications in Java (slides_001/main.typ:423, 434)
 * Demo: Public class, matching filename, entry point.
 *       The class name is freely selectable (slide: MyApplication in MyApplication.java);
 *       the method must always be called main.
 */
package lecture01;

public class Ex08_MyApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// Try live: rename the class without renaming the file ->
// "class X is public, should be declared in a file named X.java".
// Rename main -> IntelliJ shows no run arrow; java reports "Main method not found".
