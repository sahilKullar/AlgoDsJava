package algo.merge_sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {4, 3, 6, 1, 5, 9, 3, 6, 9, 3, 1, 5, 7};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array);
        for (int a : array) {
            System.out.println(a);
        }
    }

    private void sort(int[] array) {
        sortArray(array, 0, array.length - 1);
    }

    private static void sortArray(int[] array, int start, int end) {
        if (end <= start) {
            return; //we are done traversing
        }
        int mid = (start + end) / 2;
        sortArray(array, start, mid);
        sortArray(array, mid + 1, end);
        mergeArray(array, start, mid, end);
    }

    private static void mergeArray(int[] array, int start, int mid, int end) {
        int[] tempArray = new int[end - start + 1];
        int leftSlot = start;
        int rightSlot = mid + 1;
        int k = 0;
        while (leftSlot <= mid && rightSlot <= end) {
            if (array[leftSlot] < array[rightSlot]) {
                tempArray[k] = array[leftSlot];
                leftSlot = leftSlot + 1;
            } else {
                tempArray[k] = array[rightSlot];
                rightSlot = rightSlot + 1;
            }
            k = k + 1;
        }

        if (leftSlot <= mid) {
            while (leftSlot <= mid) {
                tempArray[k] = array[leftSlot];
                leftSlot = leftSlot + 1;
                k = k + 1;
            }
        } else if (rightSlot <= end) {
            while (rightSlot <= end) {
                tempArray[k] = array[rightSlot];
                rightSlot = rightSlot + 1;
                k = k + 1;
            }
        }

        for (int i = 0; i < tempArray.length; i++) {
            array[start + i] = tempArray[i];
        }
    }
}
