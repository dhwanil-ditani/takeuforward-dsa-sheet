package Sorting.SelectionSort;

public class Solution {
    int select(int arr[], int i) {
        int min = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[min] > arr[j]) {
                min = j;
            }
        }
        return min;
    }

    void selectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int min = select(arr, i);
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        new Solution().selectionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
