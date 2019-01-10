package algo.insertion_sort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] sortedArray = insertionSort(new int[]{22, 11, 44, 55, 33, 66, 99, 77, 88});
        for (int var : sortedArray) {
            System.out.println(var);
        }
    }

    public static int[] insertionSort(int[] sortArray) {
        for (int i = 1; i < sortArray.length; i++) {
            int element = sortArray[i];
            int j = i - 1;
            while (j >= 0 && sortArray[j] > element) {
                sortArray[j + 1] = sortArray[j];
                j--;
            }
            sortArray[j + 1] = element;
        }
        return sortArray;
    }
}
