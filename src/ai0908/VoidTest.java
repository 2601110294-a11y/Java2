package ai0908;

public class VoidTest {
    public static void printLine(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

   public static void main(String[] args) {
       char[] shape = {'☆', '♥', '♧', '◆', '♠', '●', '▲'};
        int[] count = {10, 20, 30, 40, 50, 60, 70};

       for (int i = 0; i < shape.length; i++) {
            printLine(shape[i], count[i]);


        }
    }
}
