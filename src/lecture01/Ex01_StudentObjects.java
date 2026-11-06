/*
 * Lecture 1 – Objects and classes (slides_001/main.typ:205)
 * Demo: One blueprint. Many objects. The Student class can describe both Max and Ines:
 *       different names, different student IDs.
 */
package lecture01;

public class Ex01_StudentObjects {

    static class Student {
        String name;
        String address;
        int studentId;
    }

    public static void main(String[] args) {
        Student max = new Student();
        max.name = "Max";
        max.address = "Berliner Tor 7";
        max.studentId = 1001;

        Student ines = new Student();
        ines.name = "Ines";
        ines.address = "Steindamm 94";
        ines.studentId = 1002;

        System.out.println(max.name + " has ID " + max.studentId);
        System.out.println(ines.name + " has ID " + ines.studentId);
    }
}
