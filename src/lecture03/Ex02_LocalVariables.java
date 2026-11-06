/*
 * Lecture 3 – Example: Local Variables (slides_003/main.typ:98)
 * Question: What values do `count`, `lena`, and `jan` have?
 */
package lecture03;

public class Ex02_LocalVariables {

    static class Student {
        String name;
        int matrNumber;
        int enrolledYear;
    }

    public static void main(String[] args) {
        int count;
        Student lena, jan;

        // COMPILE ERROR: variable count might not have been initialized
        // System.out.println(count);
        // COMPILE ERROR: variable lena might not have been initialized
        // System.out.println(lena);
    }
}

// Answer: None. Local variables get no default value; they are uninitialized.
// The compiler refuses to read them before an assignment (uncomment above to see).
// Note: lena and jan are only references; no Student object exists yet.
