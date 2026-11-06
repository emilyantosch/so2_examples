/*
 * Lecture 3 – The `this` Reference (slides_003/main.typ:433, 446)
 * Question: Can the parameter have the same name as the field? Does this change the field?
 */
package lecture03;

public class Ex13_ShadowedField {

    static class Student {
        String name;

        void setNameNew(String newName) {
            name = newName;
        }

        void setName(String name) {
            name = name;
        }
    }

    public static void main(String[] args) {
        Student lena = new Student();
        lena.setNameNew("Lena");
        System.out.println(lena.name);

        lena.setName("Birgit");
        System.out.println(lena.name);
    }
}

// Answer:
// Lena
// Lena
// Yes, it compiles, but `name = name;` assigns the parameter to itself.
// The parameter hides the field, so the field is not changed. Fix: this.name = name;
