package labs.lab_3;

public class Lab_3_4 {
    public static void main(String[] args) {
        ArrayHelper arrayHelper = new ArrayHelper();
        int[] integerArrayA = arrayHelper.inputAnArray();

        int[] integerArrayB = arrayHelper.inputAnArray();

        System.out.print("Array 01: ");
        arrayHelper.printAnArray(integerArrayA);

        System.out.print("Array 02: ");
        arrayHelper.printAnArray(integerArrayB);

        System.out.print("Expected output: ");
        arrayHelper.printAnArray(arrayHelper.merge2SortedArrays(integerArrayA, integerArrayB));
    }
}
