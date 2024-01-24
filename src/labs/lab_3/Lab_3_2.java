package labs.lab_3;

public class Lab_3_2 {
    public static void main(String[] args) {
        ArrayHelper arrayHelper = new ArrayHelper();
        int[] integerArray = arrayHelper.inputAnArray();

        System.out.println("Minimum: " + arrayHelper.findMin(integerArray));
        System.out.println("Maximum: " + arrayHelper.findMax(integerArray));
    }
}
