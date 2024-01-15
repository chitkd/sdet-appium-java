package lessons.lesson_2;

public class PrefixPostfix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // Prefix (++)a, b(++)Postfix

        int c = ++a + b++;

        /*
        prefix > right operand > assign value for left operand > postfix
        a = 2
        c = 4
        b = 3
         */
        System.out.printf("a = %d; b = %d; c = %d\n", a, b, c);
    }
}
