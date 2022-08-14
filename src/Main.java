public class Main {
    public static void main(String[] args) {
        // Задание №1:
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        int[] array11 = new int[7];
        for (int i = 0; i < array11.length; i++) {
            array11[i] = i + 1;
        }

        float[] array2 = {1.570f, 7.654f, 9.986f};
        double[] array21 = {1.570, 7.654, 9.986};

        char[] array3 = new char[5];
        array3[0] = '!';
        array3[1] = '#';
        array3[2] = '$';
        array3[3] = '%';
        array3[4] = '&';

        // Задание №2:
        System.out.println("Ответ на задание №2: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i != array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i != array3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        // Задание №3:
        System.out.println("Ответ на задание №3: ");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        // Задание №4:
        System.out.println("Ответ на задание №4: ");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 1) {
                array1[i]++;
            }
            System.out.print(array1[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
    }
}