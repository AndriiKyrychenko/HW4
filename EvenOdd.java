import java.util.Arrays;
import java.util.Random;

public class EvenOdd {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numberArray = new int[10];
        int min = 10;
        int max = 20;

        fillArray(numberArray, random, min, max);

        int[] numberSorted = new int[numberArray.length];

        numberSort(numberArray, numberSorted);
    }

    public static void fillArray(int[] numberArray, Random random, int min, int max) {
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = min + random.nextInt(max - min + 1);
        }
        System.out.println(Arrays.toString(numberArray));
    }

    public static void numberSort(int[] numberArray, int[] numberSorted) {
        int arrayEvenIndex = 0;
        int arrayOddIndex = numberSorted.length - 1;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 == 0) {
                numberSorted[arrayEvenIndex] = numberArray[i];
                arrayEvenIndex++;
            } else {
                numberSorted[arrayOddIndex] = numberArray[i];
                arrayOddIndex--;
            }
        }
        System.out.println(Arrays.toString(numberSorted));
    }
}

