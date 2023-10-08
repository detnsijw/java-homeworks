package sorting_examples;

public class InsertionSort {
    public static void insertionSort(int[] sortArr) {
        int j;
        for(int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for(j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }

    public static void main(String[] args) {
        int[] sortArr = {12, 1, 34, 11, 98, 71, 546, 32, 38};
        insertionSort(sortArr);
        for(int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + " ");
        }
    }
}
