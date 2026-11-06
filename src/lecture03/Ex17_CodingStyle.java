/*
 * Lecture 3 – Methods: Coding Style (slides_003/main.typ:541)
 * Demo: Use spaces around operators and after commas. Keep indentation consistent.
 */
package lecture03;

public class Ex17_CodingStyle {

    public static void main(String[] args) {
        // Readable
        int a = 5;
        for (int i = 1; i < 10; i++) {
            a *= i;
        }
        System.out.println(a);

        // Cramped: same result, harder to read (try Code -> Reformat Code)
        int b=5;
        for(int i=1;i<10;i++){
            b*=i;
        }
        System.out.println(b);
    }
}
