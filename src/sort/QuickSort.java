package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {12, 7, 15, 10, 18, 13, 20, 16};
        QuickSort qs = new QuickSort();
        qs.quickSort(a, 0, 7);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    void quickSort(int[] a, int left, int right) {
        if (left > right) {
            return;
        }

        //divide
        int pivot = partition(a, left, right);

        //conquer
        //arrange the left side of pivot
        quickSort(a, left, pivot - 1);

        //arrane the right side of pivot
        quickSort(a, pivot + 1, right);
    }

    int partition(int[] a, int left, int right) {
        //assign the first one is pivot
        int pivot = a[left];

        //find index of the pivot
        int count = 0;
        for (int i = left + 1; i <= right; i++) {
            if (a[i] < pivot) {
                count++;
            }
        }
        int pivot_idx = left + count;

        //swap
        swap(a, left, pivot_idx);

        //ensure left side of the pivot is less than pivot and also the right side
        int i = left;
        int j = right;
        while (i < pivot_idx && j > pivot_idx) {
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;
            if (i < pivot_idx && j > pivot_idx) swap(a, i, j);
        }

        return pivot_idx;
    }

    void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

}
