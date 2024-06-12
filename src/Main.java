import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        float[] c = {0.349f, 0.243f, 0.9123f, 0.24366f};
        System.out.println();

        System.out.println("Task 2");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            if (i == b.length - 1) {
                System.out.print(b[i]);
            } else {
                System.out.print(b[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                System.out.print(c[i]);
            } else {
                System.out.print(c[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Task 3");
        for (int i = a.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println();
        for (int i = b.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(b[i]);
            } else {
                System.out.print(b[i] + ", ");
            }
        }
        System.out.println();
        for (int i = c.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(c[i]);
            } else {
                System.out.print(c[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Task 4");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
