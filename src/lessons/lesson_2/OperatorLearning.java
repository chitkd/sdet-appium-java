package lessons.lesson_2;

public class OperatorLearning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        // Left operand & right operand
        int total = myNum1 + myNum2;
        System.out.println("Total: " + total);

        // Print with format: %d, %f, %b, %s
        System.out.printf("Total: %d\n", total);

        // Chia lay phan nguyen
        System.out.printf("\t Phep chia %d cho %d, co phan nguyen laf %d\n", 5, 2, 5/2);

        //
        double a = 10/3d;
        System.out.println("a = " + a);
    }
}
