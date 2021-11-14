package vt.epam;

public class Eighth {
    public static void main(String[] args) {
        System.out.println("8. Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= … <=an и b1\n" +
                "<= b2 <= … <= bm. Требуется указать те места, на которые нужно вставлять элементы \n" +
                "последовательности b1 <= b2 <= … <= bm в первую последовательность так, чтобы новая \n" +
                "последовательность оставалась возрастающей");
        int[] a = new int[] { 1, 7, 10, 11, 18, 22, 22 };
        int[] b = new int[] { 4, 4, 7, 8, 12 };
        newAscendingSequence(a, b);
    }
    private static void newAscendingSequence(int[] a, int[] b) {
        int i = 0, n = 0, m = 0;
        while (i < a.length + b.length) {
            if (a[n] <= b[m]) {
                System.out.printf("%d ", a[n++]);
                if (n == a.length) {
                    for (int j = i + 1; j < b.length + a.length; j++) {
                        System.out.printf("%d(b) ", b[m++]);
                    }
                    break;
                }
            } else {
                System.out.printf("%d (b) ", b[m++]);
                if (m == b.length) {
                    for (int j = i + 1; j < a.length + b.length; j++) {
                        System.out.printf("%d ", a[n++]);
                    }
                    break;
                }
            }
            i++;
        }
    }
}
