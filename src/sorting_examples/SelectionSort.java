package sorting_examples;

public class SelectionSort {
    public static void selectionSort(int[] sortArr) {
        for(int i = 0; i < sortArr.length; i++) {
            int pos = i;
            int min = sortArr[i];
            for(int j = i + 1; j < sortArr.length; j++) {
                if(sortArr[j] < min) {
                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            sortArr[i] = min;
        }
    }

    public static void main(String[] args) {
        int[] sortArr = {12, 1, 34, 11, 98, 71, 546, 32, 38};
        selectionSort(sortArr);
        for(int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + " ");
        }
    }
}