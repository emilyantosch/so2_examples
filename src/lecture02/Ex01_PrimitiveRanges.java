/*
 * Lecture 2 – Data Types in Java (slides_002/main.typ:72)
 * Demo: Table of primitive types with size and range.
 */
package lecture02;

public class Ex01_PrimitiveRanges {

    public static void main(String[] args) {
        System.out.println("byte   " + Byte.BYTES + " byte : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short  " + Short.BYTES + " bytes: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int    " + Integer.BYTES + " bytes: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long   " + Long.BYTES + " bytes: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("char   " + Character.BYTES + " bytes: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("float  " + Float.BYTES + " bytes: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double " + Double.BYTES + " bytes: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("boolean: " + false + " or " + true);
    }
}
