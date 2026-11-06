/*
 * Lecture 4 – Numbers and Strings (slides_004/main.typ:639, 642)
 * Demo: Integer.toString(7) and Integer.parseInt("7").
 */
package lecture04;

public class Ex30_NumbersAndStrings {

    public static void main(String[] args) {
        int a = 7;
        Integer b = Integer.valueOf(a);
        String c = b.toString();
        System.out.println(c + 1); // String: "71"

        String text = Integer.toString(7);
        int number = Integer.parseInt(text);
        System.out.println(number + 1); // int: 8

        double d = Double.parseDouble("21.4532");
        System.out.println(d);

        int invalid = Integer.parseInt("seven"); // NumberFormatException
    }
}

// Output:
// 71
// 8
// 21.4532
// Exception in thread "main" java.lang.NumberFormatException: For input string: "seven"
