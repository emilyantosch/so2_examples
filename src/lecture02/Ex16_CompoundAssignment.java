/*
 * Lecture 2 – Assignment Operators (slides_002/main.typ:428)
 * Question: What does this print?
 */
package lecture02;

public class Ex16_CompoundAssignment {

    public static void main(String[] args) {
        int a = 1;
        a += 2;
        System.out.println(a);
        System.out.println(a *= --a);
        System.out.println(a *= -a++);
        System.out.println(a /= 10);
    }
}

// Answer:
// 3     (1 + 2)
// 6     left a is read once (3), then --a gives 2: 3 * 2
// -36   left a is read once (6), -a++ gives -6 (a++ is overwritten by the assignment): 6 * -6
// -3    -36 / 10, integer division truncates toward zero
