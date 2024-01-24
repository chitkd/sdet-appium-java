package labs.lab_3;

public class Lab_3_3 {
    public static void main(String[] args) {
        ArrayHelper arrayHelper = new ArrayHelper();
        int[] integerArray = arrayHelper.inputAnArray();

        System.out.print("Input: ");
        arrayHelper.printAnArray(integerArray);
        arrayHelper.sortArray(integerArray);
        System.out.print("Expected output: ");
        arrayHelper.printAnArray(integerArray);
    }
}
