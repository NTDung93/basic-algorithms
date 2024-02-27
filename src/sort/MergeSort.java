package sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {25, 30, 45, 6, 11, 90, 15};
        MergeSort ms = new MergeSort();
        ms.sort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    void sort(int a[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(a, l, m);
            sort(a, m + 1, r);
            mergeSort(a, l, r);
        }
    }

    void mergeSort(int[] arr, int l, int r) {
        int m = (l + r) / 2;

        int n1 = m - l + 1; //4
        int n2 = r - m; //3

        int[] a = new int[n1];
        int[] b = new int[n2];

        //devide
        for (int i = 0; i < n1; i++) {
            a[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            b[i] = arr[m + 1 + i];
        }

        //merge
        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = a[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = b[j];
            j++;
            k++;
        }
    }
}
