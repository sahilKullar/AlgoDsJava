package algo.selection_sort;

public class SelectionSort {
//    public int[] unsortedArray = {2, 1, 55, 33, 35, 68, 23, 46, 33, 14};

    public static void main(String[] args) {
        int[] array = sortArray(new int[]{2, 1, 55, 33, 35, 68, 23, 46, 33, 14});

        for (int var : array) {
            System.out.println(var);
        }
    }

    public static int[] sortArray(int[] sortArray) {
        for (int i = 0; i < sortArray.length; i++) {
            int minimum = i;
            for (int j = i + 1; j < sortArray.length; j++) {
                if (sortArray[j] < sortArray[minimum]) {
                    minimum = j;
                }
            }
            int temp = sortArray[i];
            sortArray[i] = sortArray[minimum];
            sortArray[minimum] = temp;
        }
        return sortArray;
    }
}
