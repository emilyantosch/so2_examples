/*
 * Lecture 4 – String Formatting (slides_004/main.typ:220)
 * Demo: Conversions and flags from the table.
 */
package lecture04;

import java.time.LocalDate;
import java.util.Locale;

public class Ex10_FormatConversionsFlags {

    public static void main(String[] args) {
        // Conversions
        System.out.println(String.format(Locale.US, "f: %f  e: %e  g: %g", 1234.5678, 1234.5678, 1234.5678));
        System.out.println(String.format(Locale.US, "d: %d  o: %o  x: %x  X: %X", 255, 255, 255, 255));
        System.out.println(String.format(Locale.US, "s: %s  b: %b", "Hamburg", true));
        LocalDate date = LocalDate.of(2026, 10, 21);
        System.out.println(String.format(Locale.US, "tY: %tY  tm: %tm  td: %td  tA: %tA", date, date, date, date));

        // Flags
        System.out.println(String.format(Locale.US, "[%-8d]", 42));   // left-align
        System.out.println(String.format(Locale.US, "[%+d]", 42));    // always show sign
        System.out.println(String.format(Locale.US, "[%08d]", 42));   // pad with zeros
        System.out.println(String.format(Locale.US, "[%,d]", 1234567)); // group thousands
        System.out.println(String.format(Locale.US, "[%(d]", -42));   // parentheses for negatives
    }
}

// Output:
// f: 1234.567800  e: 1.234568e+03  g: 1234.57
// d: 255  o: 377  x: ff  X: FF
// s: Hamburg  b: true
// tY: 2026  tm: 10  td: 21  tA: Wednesday
// [42      ]
// [+42]
// [00000042]
// [1,234,567]
// [(42)]
