/*
 * Lecture 2 – Identifiers (slides_002/main.typ:297)
 * Question: Which identifiers are allowed, and why?
 */
package lecture02;

import javax.lang.model.SourceVersion;

public class Ex11_Identifiers {

    public static void main(String[] args) {
        // Run first: let Java itself judge every name from the slide.
        String[] names = {
            "length", "länge", "maxLength", "max_length", "_max_length", "max-length", "!maxLength",
            "3dlength", "öpnvKosten", "€kosten", "kostenin€", "€", "long", "c.o.s.t", "@cost"
        };
        for (String name : names) {
            boolean allowed = SourceVersion.isIdentifier(name) && !SourceVersion.isKeyword(name);
            System.out.println(name + " -> " + (allowed ? "allowed" : "NOT allowed"));
        }
        slideDeclarations();
    }

    static void slideDeclarations() {
        int length;
        int länge;
        int maxLength;
        int max_length;
        int _max_length;
        // COMPILE ERROR: '-' is the minus operator
        // int max-length;
        // COMPILE ERROR: '!' is not a Java letter
        // int !maxLength;

        // COMPILE ERROR: must not start with a digit
        // int 3dlength;
        String öpnvKosten;
        String €kosten;
        String kostenin€;
        String €;
        // COMPILE ERROR: long is a keyword
        // int long;
        // COMPILE ERROR: '.' is not allowed in a name
        // int c.o.s.t;
        // COMPILE ERROR: '@' starts an annotation
        // String @cost;
    }
}

// Answer: Allowed: length, länge, maxLength, max_length, _max_length, öpnvKosten,
//         €kosten, kostenin€, € (Unicode letters and currency symbols count as Java letters).
//         Not allowed: max-length (minus), !maxLength (! not a letter), 3dlength (starts with digit),
//         long (keyword), c.o.s.t (dot), @cost (@ is annotation syntax).
//         Style: legal is not the same as good. Prefer maxLength (lowerCamelCase, English, ASCII).
